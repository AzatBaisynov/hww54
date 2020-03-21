import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        PrintWriter out = resp.getWriter();
        out.println("<br>");
        out.println("<A HREF=\"http://localhost:8080/myapp/start.jsp\">main page</A> <br>");
        printWriter.print(LocalTime.now() + " : " + LocalDate.now());


    }


}
