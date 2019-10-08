<%-- 
    Document   : ListarCanvasx
    Created on : 08/10/2019, 00:05:59
    Author     : davi
--%>

<%@page import="java.util.List"%>
<%@page import="br.edu.ifmt.incubadorabemcanvas.canvasDAO.CanvasDAO"%>
<%@page import="br.edu.ifmt.incubadorabemcanvas.entidade.cavas.Canvas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Criar Canvas</title>

    </head>

    <body>

        <h1>Cadastro de Canvas</h1>
        <form action="    " method="get">
            <label> Meus Canvas Criado :</label><br/>
            <%

                Canvas canvas = new Canvas();
                
                System.out.println(canvas.getNomeCanvasWeb());

            %>

       

    </form>

</body>
<footer> </footer>
</html>
