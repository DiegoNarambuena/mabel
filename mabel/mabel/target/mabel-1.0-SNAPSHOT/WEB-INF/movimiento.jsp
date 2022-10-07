<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conclusion</title>
    </head>
    <body>
        <c:choose>
    <c:when test="${error}">
        <h1> Error al transferir </h1> 
        <br />
    </c:when>    
    <c:otherwise>
        <h1>Transfencia Realizada</h1>
        <h2> Transaccion <h2>
        <table border="1" style="padding: 2px;">
            <tr><th>Cuenta Origen: </th> <td>${origen.nroCuenta}</td><td>${origen.saldo}</td></tr>
            <tr><th>Cuenta Destino: </th> <td>${destino.nroCuenta}</td><td>${destino.saldo}</td></tr>
            <tr><th>Monto: </th> <td>${monto}</td></tr>
        </table>
        <br />
    </c:otherwise>
</c:choose>
        
        <a href="/mabel/transfe">Regresar</a>
    </body>
</html>