package br.edu.ifmt.incubadorabemcanvas.canvasDAO;
/**
 *
 * @author Adavilson 20/09/2019
 */

import br.edu.ifmt.incubadorabemcanvas.util.exception.ErroSistema;
import java.util.List;

public interface CrudDAO<E> {//E representa minha entidade

    
    
    public void salvar(E entidade) throws ErroSistema;
    public void deletar(E entidade) throws ErroSistema;
    public List<E> buscar() throws ErroSistema;
    
}
