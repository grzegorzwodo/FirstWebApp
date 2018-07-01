package pl.sdacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doGet");

        response.getWriter().println("<html><head></head><body>");
        response.getWriter().println("Session: " + reqest.getSession().getId());
        response.getWriter().println(reqest.getParameter("p1") + "+" + reqest.getParameter("p2") + "=");
       // response.getWriter().println((Integer.parseInt(reqest.getParameter("p1"))+Integer.parseInt(reqest.getParameter("p2"))));
        response.getWriter().println("</body><html>");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("");
    }


    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
