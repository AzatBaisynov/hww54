import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/random")
public class RandomNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rd = new Random();
        Integer ran = rd.nextInt();
        req.setAttribute("integer", ran);
        req.getRequestDispatcher("/odd.jsp").forward(req,resp);
    }
}
