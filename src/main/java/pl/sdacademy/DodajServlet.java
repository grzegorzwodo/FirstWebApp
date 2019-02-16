package pl.sdacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DodajServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO policz liczby ktore otrzymales
        //kod wykonujacy sie po wyslaniu formularza
        Integer p1 = Integer.valueOf(request.getParameter("p1"));
        Integer p2 = Integer.valueOf(request.getParameter("p2"));

        response.getWriter().println("<html><head></head><body>");
        int result = p1 + p2;
        response.getWriter().println("Suma: " + result);
        response.getWriter().println("</body></html>");
    }


    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
