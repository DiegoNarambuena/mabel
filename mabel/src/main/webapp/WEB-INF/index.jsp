<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Transfencia entre cuentas</h1>
        
        <h2>Cuenta origen</h2>
        
        <p>Nro Cuenta   Saldo</p>
        <select name="cuenta" multiple>
                <option value="c1"></option>
                <option value="c2"></option>
                <option value="c3"></option>
        </select>
    
        <p>Cuenta Destino</p>
        <p>Nro Cuenta   Saldo</p>
        <select name="cuenta" multiple>
                <option value="1"></option>
                <option value="2"></option>
                <option value="3"></option>
        </select>
        
        <p>Monto a transferir</p>
        <input type="number" name="edad" min="0" required>
    </body>
</html>