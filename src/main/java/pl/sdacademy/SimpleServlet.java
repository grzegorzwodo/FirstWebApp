package pl.sdacademy;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SimpleServlet extends HttpServlet {

    private static Logger logger = Logger.getLogger(SimpleServlet.class);

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("doGet");
        logger.debug("doGet");
        response.getWriter().println("<html><head></head><body>");
        response.getWriter().println("Session: " + reqest.getSession().getId());
        HttpSession session = reqest.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        if(counter == null) {
            counter = 0;
        }
        counter++;
        session.setAttribute("counter", counter);
        response.getWriter().println("Licznik: " + session.getAttribute("counter"));

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
