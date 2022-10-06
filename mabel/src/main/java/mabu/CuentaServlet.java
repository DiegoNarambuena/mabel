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
    
    private static final LinkedList<CuentaBancaria> lista_cuentas = CuentaBancaria.getList_cuentas();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.setAttribute("contacto", lista_cuentas);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
