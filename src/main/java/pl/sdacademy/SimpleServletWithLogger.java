package pl.sdacademy;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleServletWithLogger extends HttpServlet {

    private static Logger logger = Logger.getLogger(SimpleServlet.class);

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("doGet with logger2");
        response.getWriter().println("Hello World!");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
