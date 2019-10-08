package br.edu.incubadorabemcanvas.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.edu.ifmt.incubadorabemcanvas.canvasDAO.CanvasDAO;
import br.edu.ifmt.incubadorabemcanvas.entidade.cavas.Canvas;
import br.edu.ifmt.incubadorabemcanvas.util.exception.ErroSistema;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author davi
 */
@WebServlet(urlPatterns = {"/SeveletCanvas"})
public class SeveletCanvas extends HttpServlet {

    CanvasDAO CasnvasDao = new CanvasDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String canvas = request.getParameter("canvasNovo");
            String parceiroChave = request.getParameter("parceiros");
            String atividadeChave = request.getParameter("atividades");
            String recursosChave = request.getParameter("recursos");
            String propostaDeValor = request.getParameter("proposta");
            String relacionamentoComClientes = request.getParameter("relacionamento");
            String canais = request.getParameter("canais");
            String segmentoDeClientes = request.getParameter("segmento");
            String estruturasDeCustos = request.getParameter("estruturas");
            String fontesDeReceitas = request.getParameter("fontes");

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Bem Vindo ao Canvas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Nome do canvas" + canvas + "</p>");
            out.println("<p>Parceiro Chave" + parceiroChave + "</p>");
            out.println("<p>Atividade Chave" + atividadeChave + "</p>");
            out.println("<p>Recursos Chave" + recursosChave + "</p>");
            out.println("<p>Proposta De Valor" + propostaDeValor + "</p>");
            out.println("<p>Relacionamento Com Clientes" + relacionamentoComClientes + "</p>");
            out.println("<p>canais" + canais + "</p>");
            out.println("<p>SegmentoDeClientes" + segmentoDeClientes + "</p>");
            out.println("<p>Estruturas De Custos" + estruturasDeCustos + "</p>");
            out.println("<p>Fontes De Receitas" + fontesDeReceitas + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */ 
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Passei no dopost");
        String nomeCanvasWeb = request.getParameter("nomeCanvasWeb");
        String parceiroChave = request.getParameter("parceiros");
        String atividadeChave = request.getParameter("atividades");
        String recursosChave = request.getParameter("recursos");
        String propostaDeValor = request.getParameter("proposta");
        String relacionamentoComClientes = request.getParameter("relacionamento");
        String canais = request.getParameter("canais");
        String segmentoDeClientes = request.getParameter("segmento");
        String estruturasDeCustos = request.getParameter("estruturas");
        String fontesDeReceitas = request.getParameter("fontes");

        Canvas canvasNovo = new Canvas(null,nomeCanvasWeb, parceiroChave, atividadeChave, recursosChave, propostaDeValor,
                relacionamentoComClientes, canais, segmentoDeClientes, estruturasDeCustos, fontesDeReceitas);
        try {
            CasnvasDao.salvar(canvasNovo);
            request.setAttribute("mensagem", "Canvas Salvo com sucesso");
        } catch (ErroSistema ex) {
            Logger.getLogger(SeveletCanvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher dispatherCanvas =request.getRequestDispatcher("ListarCanvas.jsp");
        dispatherCanvas.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
