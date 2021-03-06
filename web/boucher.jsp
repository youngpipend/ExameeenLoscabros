<%-- 
    Document   : boucher
    Created on : 04-12-2018, 22:57:06
    Author     : gamer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <div class="container-fluid" style="max-width: 600px">
            <div class="jumbotron" style="margin-top: 30px" >
                <h1>Detalles de la compra</h1>
                <h3> Numero de boucher ${compra.getIdCompra()} </h3>
                <br/>
                <br/>
                <table border="0" class="table-bordered-5 alert-warning breadcrumb caption " >
                    <tr>
                        <td style="color: #985f0d">Nombre Estacionamieto</td>
                        <td ></td>
                        <td style="color: #985f0d">Cantidad</td>
                        <td style="color: #985f0d">Nro Boleta</td>
                    </tr>
                    <c:forEach var="boleta" items="${boletas}">
                        <tr>
                            <td >${boleta.getEstacionamiento().getDescripcion()}<td/>
                            <td >${boleta.getCantidad()}</td>
                            <td >${boleta.getIdBoleta()}</td>
                        </tr>
                    </c:forEach>
                </table> 
                <h5 class="glyphicon glyphicon-shopping-cart" style="color: #985f0d">
                    Medio De Pago: ${compra.getMedioPagoString()}
                </h5>
                <br/>
                <br/>
                <h5 class="glyphicon glyphicon-plane" style="color: #985f0d"> Medio De Envio ${compra.getMedioRetiroString()}</h5>
                <h3> Total A Pagar: ${MontoTotal} </h3>
            </div>
        </div>
    </body>
</html>
