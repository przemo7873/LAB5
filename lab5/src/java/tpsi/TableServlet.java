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

@WebServlet(name = "TableServlet", urlPatterns = {"/table"})
public class TableServlet extends HttpServlet 
{
    private List<Student> students=new ArrayList();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.getRequestDispatcher("table.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();        
        students.add(new Student(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("email")));
        session.setAttribute("s", students);   
        request.getRequestDispatcher("table.jsp").forward(request, response);
    }

}
