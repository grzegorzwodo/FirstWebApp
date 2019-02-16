package pl.sdacademy;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetStudentServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(GetStudentServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO odczyt z pliku
        //i wygenerowanie tabelki

        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        String line;
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("<html><head><meta charset=\"UTF-8\"/></head><body>");

        resp.getWriter().println("<table>");
        resp.getWriter().println("<tr>");
        resp.getWriter().println("  <td>Imię</td><td>Nazwisko</td>");
        resp.getWriter().println("</tr>");
        while ((line = br.readLine()) != null) {
            log.info(line);
            resp.getWriter().println("<tr>");
            String name = line.split("\\|")[0];
            String surname = line.split("\\|")[1];
            resp.getWriter().println("  <td>"+name+"</td><td>"+surname+"</td>");
            resp.getWriter().println("</tr>");
        }
        resp.getWriter().println("</table></body></html>");

    }
}
