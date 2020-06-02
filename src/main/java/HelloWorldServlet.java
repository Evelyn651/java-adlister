import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType("text/ html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        System.out.println("name parameter= " + name);
        if (name == null) {
            out.println("<strong> Hello </strong>");
        } else {
            out.println("<strong> Hello World </strong>");
        }
    }

}
