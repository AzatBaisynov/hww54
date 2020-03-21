import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/randomSum")
public class SumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rnd = new Random();

        int a = rnd.nextInt(100);
        int b = rnd.nextInt(100);
        int sum = a + b;

        PrintWriter printWriter = resp.getWriter();
        PrintWriter out = resp.getWriter();
        out.println("<A HREF=\"http://localhost:8080/myapp/start.jsp\">main page</A> <br>");
        printWriter.print("\na = " + a + ", b = " + b + "\n");
        printWriter.print(a + " + " + b + " = " + sum + "\n");


    }
}
