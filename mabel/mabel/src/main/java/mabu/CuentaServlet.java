package mabu;

import java.io.IOException;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/transfe"})
public class CuentaServlet extends HttpServlet{
        
    LinkedList<CuentaBancaria> lista_cuentas = CuentaBancaria.getList_cuentas();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setAttribute("cuenta", lista_cuentas);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        
        String origen = req.getParameter("origen");
        String destino = req.getParameter("destino");
        String monto = req.getParameter("monto");
        
        CuentaBancaria cuenta_origen = lista_cuentas.get(Integer.valueOf(origen));
        CuentaBancaria cuenta_destino = lista_cuentas.get(Integer.valueOf(destino));
        
        Boolean exito = CuentaBancaria.transferir(cuenta_origen, cuenta_destino, monto);
        
        if(exito){
            req.setAttribute("origen", cuenta_origen);
            req.setAttribute("destino", cuenta_destino);
        req.setAttribute("monto", monto);
            req.getRequestDispatcher("/WEB-INF/movimiento.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", true);
            req.getRequestDispatcher("/WEB-INF/movimiento.jsp").forward(req, resp);
        }
    }
}