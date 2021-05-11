import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        for (int i = 1; i < 11; i++) {
            int x = (int) (Math.random() * 20);
          Product prod = new Product(i, "product " + x, x * 5);
            resp.getWriter().write(String.valueOf(prod) + '\n');
        }

    }
}
