package br.edu.ifmt.incubadorabemcanvas.canvasDAO;

/**
 *
 * @author Adavilson 20/09/2019
 */
import br.edu.ifmt.incubadorabemcanvas.canvas.conexao.FabricaConexao;
import br.edu.ifmt.incubadorabemcanvas.entidade.cavas.Canvas;
import br.edu.ifmt.incubadorabemcanvas.util.exception.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CanvasDAO implements CrudDAO<Canvas> {

    @Override
    public void salvar(Canvas canvas) throws ErroSistema {
        boolean retorno = false;
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;
            ResultSet rs = null;
            if (canvas.getId_canvas() == null) {
                ps = conexao.prepareStatement("insert into canvas (nome_canvas,parceiro_chave, atividade_chave, recurso_chave, "
                        + "proposta_valor,relacionamento_com_Cliente,"
                        + "segmentos_de_clientes,canais,estrutura_de_recurso,fonte_de_segmento) values (?,?,?,?,?,?,?,?,?,?)");
            } else {
                ps = conexao.prepareStatement("update canvas set nome_canvas= ? , parceiro_chave=?, atividade_chave=?, recurso_chave=?, proposta_valor=?,relacionamento_com_Cliente=?,"
                        + "segmentos_de_clientes=?,canais=?,estrutura_de_recurso=?,fonte_de_segmento=? where id_canvas = ?");
                ps.setInt(10, canvas.getId_canvas());
            }

            ps.setString(1, canvas.getNomeCanvasWeb());
            ps.setString(2, canvas.getParceiro_chave());
            ps.setString(3, canvas.getAtividade_chave());
            ps.setString(4, canvas.getRecurso_chave());
            ps.setString(5, canvas.getProposta_valor());
            ps.setString(6, canvas.getRelacionamento_com_Cliente());
            ps.setString(7, canvas.getSegmentos_de_clientes());
            ps.setString(8, canvas.getCanais());
            ps.setString(9, canvas.getEstrutura_de_recurso());
            ps.setString(10, canvas.getFonte_de_segmento());
//            ps.setInt(10, canvas.getId_grupoNucleoIFMT());

            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                final int id_Canvas = rs.getInt(1);
                canvas.setId_canvas(id_Canvas);
            }
            if (ps.executeUpdate() > 0) {
                retorno = true;
            }

            FabricaConexao.fecharConexao();

        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar!", ex);
        }
    }

    @Override
    public void deletar(Canvas canvas) throws ErroSistema {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("delete from canvas where id_canvas = ?");
            ps.setInt(1, canvas.getId_canvas());
            ps.execute();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao deletar o canvas", ex);
        }
    }

    @Override
    public List<Canvas> buscar() throws ErroSistema {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from canvas");
            ResultSet resultSet = ps.executeQuery();
            List<Canvas> canvais = new ArrayList<>();
            while (resultSet.next()) {
                Canvas canvas = new Canvas();
                canvas.setId_canvas(resultSet.getInt("id_parceiro_chave"));
                canvas.setNomeCanvasWeb(resultSet.getString("nome_canvas"));
                canvas.setParceiro_chave(resultSet.getString("parceiro_chave"));
                canvas.setAtividade_chave(resultSet.getString("atividade_chave"));
                canvas.setRecurso_chave(resultSet.getString("recurso_chave"));
                canvas.setProposta_valor(resultSet.getString("proposta_valor"));
                canvas.setRelacionamento_com_Cliente(resultSet.getString("relacionamento_com_Cliente"));
                canvas.setSegmentos_de_clientes(resultSet.getString("segmentos_de_clientes"));
                canvas.setCanais(resultSet.getString("canais"));
                canvas.setEstrutura_de_recurso(resultSet.getString("estrutura_de_recurso"));
                canvas.setFonte_de_segmento(resultSet.getString("fonte_de_segmento"));
//                canvas.setId_grupoNucleoIFMT(resultSet.getInt("id_grupoNucleoIFMT"));
                canvais.add(canvas);
            }
            FabricaConexao.fecharConexao();
            return canvais;

        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar o canvas", ex);
        }
    }

}
