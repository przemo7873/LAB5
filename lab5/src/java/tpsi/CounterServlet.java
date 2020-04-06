package tpsi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CounterServlet", urlPatterns = {"/counter"})
public class CounterServlet extends HttpServlet 
{
    private Integer licznik;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("licznik")==null) 
            licznik =1;
        else 
        {
            licznik = (Integer) session.getAttribute("licznik");
            licznik++;
        }
        session.setAttribute("licznik", licznik);
        request.getRequestDispatcher("counter.jsp").forward(request, response);
    }
}
