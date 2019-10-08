package br.edu.ifmt.incubadorabemcanvas.util.exception;

/**
 *
 * @author Adavilson 20/09/2019
 */

public class ErroSistema extends Exception {

    public ErroSistema(String message) {
        super(message);
    }

    public ErroSistema(String message, Throwable cause) {
        super(message, cause);
    }
    
}
