<%-- 
    Document   : Canvas
    Created on : 06/10/2019, 00:56:17
    Author     : davi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ben-Canvas </title>
        <script>
            function f1() {
                var h = prompt("Parceiro-Chave!", "Nome do parceiro");
                console.log(h.toString());
                if (h === undefined) {
                }
                if (h !== null && h.toString() !== "") {
                    document.getElementById("parceiros").value += h;
                }
            }

            function f2() {
                var terra = prompt("Atividade-Chave!", "atidivades chave");
                console.log(terra.toString());
                if (terra === undefined) {
                }
                if (terra.toString !== null && terra !== "") {
                    document.getElementById("atividades").value += terra;
                }
            }
            function f3() {
                var p3 = prompt("Recursos-Chave!", "Recursos utilizados");
                console.log(p3.toString());
                if (p3 === undefined) {

                }

                if (p3.toString !== null && p3 !== "") {
                    document.getElementById("recursos").value += p3;
                }
            }
            function f4() {
                var p4 = prompt("Proposta de Valor!", "Proposta do projeto ");
                if (p4 === undefined) {

                }

                if (p4.toString !== null && p4 !== "") {
                    document.getElementById("proposta").value += p4;
                }
            }

            function f5() {
                var p5 = prompt("Relacionamento com Clientes!", "Relacionamento com os clientes");
                if (p5 === undefined) {

                }

                if (p5.toString !== null && p5 !== "") {
                    document.getElementById("relacionamento").value += p5;
                }

            }
            function f6() {
                var p6 = prompt("Canais!", "Nome dos canais de apoio");
                if (p6 === undefined) {

                }

                if (p6.toString !== null && p6 !== "") {
                    document.getElementById("canais").value += p6;
                }


            }
            function f7() {
                var p7 = prompt("Segmento de Clientes!", "Segmentos dos Clientes");
                if (p7 === undefined) {

                }

                if (p7.toString !== null && p7 !== "") {
                    document.getElementById("segmento").value += p7;
                }

            }
            function f8() {
                var p8 = prompt("Estruturas de custos!", "Valor de custo");
                if (f8 === undefined) {

                }

                if (f8.toString !== null && f8 !== "") {
                    document.getElementById("estruturas").value += p8;
                }

            }
            function f9() {
                var p9 = prompt("Fontes de receitas!", "Objetivo de fontes");
                if (p9 === undefined) {

                }

                if (p9.toString !== null && p9 !== "") {
                    document.getElementById("fontes").value += p9;
                }

            }



            









        </script>
    </head>
    <body>

        <table border="1" width="100%" height="100%">
            <tr>
                <td>
                    <button OnClick="f1()">Parceiros chaves</button><br></br>
                    <button OnClick="f2()">Atividades Chaves</button><br></br>
                    <button OnClick="f3()">Recursos Chave</button><br></br>
                    <button OnClick="f4()">Proposta de Valor</button><br></br>
                    <button OnClick="f5()">Relacionamento com Clientes</button><br></br>
                    <button OnClick="f6()">Canais</button><br></br>
                    <button OnClick="f7()">Segmento de Clientes</button><br></br>
                    <button OnClick="f8()">Estruturas de custos</button><br></br>
                    <button OnClick="f9()">fontes de receitas</button><br></br>

                </td>
                <td>
                    <% String nomeCanvas = request.getParameter("Canvas"); %>
                    <form action="SeveletCanvas" method="POST">
                        <table border="1" width="100%" height="100%">
                            <tr><td colspan="5"><h1 align="center " name="canvasNovo" id="canvasNovo"> 
                                        </br> <%out.print(nomeCanvas);%> 
                                    </h1></td></tr>
                            
                            <input type="hidden" name="nomeCanvasWeb" value="<% out.print(nomeCanvas); %>">
                            <tr>
                                <td rowspan="2" width="20%" >

                                    <h1 align="center "> Parceiros-Chave</h1>

                                    <textarea rows="10" cols="40" maxlength="500" type="text" name="parceiros" id="parceiros"   > </textarea>

                                </td>

                                <td  width="20%"  >

                                    <h1 align="center ">  Atividades-Chave</h1>

                                    <textarea rows="10" cols="40" maxlength="500" type="text" name="atividades"  id="atividades"  > </textarea>

                                </td>

                                <td rowspan="2" width="20%">
                                    <h1 align="center ">   Proposta de Valor</h1>
                                    <textarea rows="10" cols="40" maxlength="500" type="text" name="proposta"  id="proposta"> </textarea>
                                </td>

                                <td width="20%" >

                                    <h1 align="center ">  Relacionamento com Clientes</h1>
                                    <textarea rows="10" cols="40" maxlength="500" type="text" name="relacionamento"   id="relacionamento"> </textarea>

                                </td>

                                <td rowspan="2" width="20%" >

                                    <h1 align="center ">  Segmento de Clientes</h1>
                                    <textarea rows="10" cols="40" maxlength="500" type="text" name="segmento"   id="segmento" > </textarea>

                                </td>

                            </tr>

                            <tr><td >
                                    <h1 align="center "> Recursos-Chave</h1>
                                    <textarea rows="10" cols="40" maxlength="500" type="text" name="recursos" id="recursos" > </textarea>
                                </td><td >

                                    <h1 align="center ">  Canais </h1>
                                    <textarea rows="10" cols="40" maxlength="500" type="text" name="canais"  id="canais" > </textarea>

                                </td></tr>
                            <tr><td colspan="5">
                                    <table border="1" width="100%" height="100%">
                                        <tr><td width="50%" >

                                                <h1 align="center ">   Estruturas de custos</h1>
                                                <textarea rows="10" cols="40" maxlength="500" type="text" name="estruturas" id="estruturas" > </textarea>
                                            </td><td >
                                                <h1 align="center ">  fontes de receitas</h1>
                                                <textarea rows="10" cols="40" maxlength="500" type="text" name="fontes"  id="fontes" > </textarea>
                                            </td></tr>
                                    </table>
                                </td></tr>
                            <tr><td colspan="5">Midia do Nucleo Incubador</td></tr>
                        </table>

                        <input type="submit" value="enviar">


                    </form>
                                    
                </td>
            </tr>
        </table>
                                    
    </body>
</html>
