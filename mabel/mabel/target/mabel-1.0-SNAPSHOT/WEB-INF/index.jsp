<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Transfencia entre cuentas</h1>
        
        <h2>Cuenta origen</h2>
        
        <p>Nro Cuenta         Saldo</p>
        <form method = "post" action ="<c:url value="/transfe"/>">
        <select name="origen" required>
            <c:forEach items="${cuenta}" var="item">
               <option value="${item.id}"> ${item.nroCuenta} ${item.saldo}</option>
            </c:forEach>
        </select>
    
        <p>Cuenta Destino</p>
        <p>Nro Cuenta   Saldo</p>
        <select name="destino" required>
            <c:forEach items="${cuenta}" var="item">
               <option value="${item.id}"> ${item.nroCuenta} ${item.saldo}</option>
            </c:forEach>
        </select>
        
        <p>Monto a transferir</p>
        <input type="number" name="monto" min="0" required>
        <input type ="submit" value = "enviar"></input>
        </form>
    </body>
</html>