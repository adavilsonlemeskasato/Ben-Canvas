package br.edu.ifmt.incubadorabemcanvas.entidade.cavas;

import java.util.Objects;

/**
 *
 * @author Adavilson 20/09/2019
 */
public class Canvas {

    private Integer id_canvas;
    private String nomeCanvasWeb;
    private String parceiro_chave;
    private String atividade_chave;
    private String recurso_chave;
    private String proposta_valor;
    private String relacionamento_com_Cliente;
    private String segmentos_de_clientes;
    private String canais;
    private String estrutura_de_recurso;
    private String fonte_de_segmento;
//    private Integer id_grupoNucleoIFMT;

    public Canvas() {
    }

    public Canvas(Integer id_canvas, String nomeCanvasWeb, String parceiro_chave, String atividade_chave, String recurso_chave, String proposta_valor, String relacionamento_com_Cliente, String segmentos_de_clientes, String canais, String estrutura_de_recurso, String fonte_de_segmento) {
        this.id_canvas = id_canvas;
        this.nomeCanvasWeb = nomeCanvasWeb;
        this.parceiro_chave = parceiro_chave;
        this.atividade_chave = atividade_chave;
        this.recurso_chave = recurso_chave;
        this.proposta_valor = proposta_valor;
        this.relacionamento_com_Cliente = relacionamento_com_Cliente;
        this.segmentos_de_clientes = segmentos_de_clientes;
        this.canais = canais;
        this.estrutura_de_recurso = estrutura_de_recurso;
        this.fonte_de_segmento = fonte_de_segmento;
    }

    public Integer getId_canvas() {
        return id_canvas;
    }

    public void setId_canvas(Integer id_canvas) {
        this.id_canvas = id_canvas;
    }
    
    public String getNomeCanvasWeb() {
        return nomeCanvasWeb;
    }

    public void setNomeCanvasWeb(String nomeCanvasWeb) {
        this.nomeCanvasWeb = nomeCanvasWeb;
    }

    public String getParceiro_chave() {
        return parceiro_chave;
    }

    public void setParceiro_chave(String parceiro_chave) {
        this.parceiro_chave = parceiro_chave;
    }

    public String getAtividade_chave() {
        return atividade_chave;
    }

    public void setAtividade_chave(String atividade_chave) {
        this.atividade_chave = atividade_chave;
    }

    public String getRecurso_chave() {
        return recurso_chave;
    }

    public void setRecurso_chave(String recurso_chave) {
        this.recurso_chave = recurso_chave;
    }

    public String getProposta_valor() {
        return proposta_valor;
    }

    public void setProposta_valor(String proposta_valor) {
        this.proposta_valor = proposta_valor;
    }

    public String getRelacionamento_com_Cliente() {
        return relacionamento_com_Cliente;
    }

    public void setRelacionamento_com_Cliente(String relacionamento_com_Cliente) {
        this.relacionamento_com_Cliente = relacionamento_com_Cliente;
    }

    public String getSegmentos_de_clientes() {
        return segmentos_de_clientes;
    }

    public void setSegmentos_de_clientes(String segmento_de_cliente) {
        this.segmentos_de_clientes = segmento_de_cliente;
    }

    public String getCanais() {
        return canais;
    }

    public void setCanais(String canais) {
        this.canais = canais;
    }

    public String getEstrutura_de_recurso() {
        return estrutura_de_recurso;
    }

    public void setEstrutura_de_recurso(String estrutura_de_recurso) {
        this.estrutura_de_recurso = estrutura_de_recurso;
    }

    public String getFonte_de_segmento() {
        return fonte_de_segmento;
    }

    public void setFonte_de_segmento(String fonte_de_segmento) {
        this.fonte_de_segmento = fonte_de_segmento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id_canvas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Canvas other = (Canvas) obj;
        if (!Objects.equals(this.id_canvas, other.id_canvas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Canvas{" + "id_canvas=" + id_canvas + ", parceiro_chave=" + parceiro_chave + ", atividade_chave=" + atividade_chave + ", recurso_chave=" + recurso_chave + ", proposta_valor=" + proposta_valor + ", relacionamento_com_Cliente=" + relacionamento_com_Cliente + ", segmentos_de_clientes=" + segmentos_de_clientes + ", canais=" + canais + ", estrutura_de_recurso=" + estrutura_de_recurso + ", fonte_de_segmento=" + fonte_de_segmento + '}';
    }
}
