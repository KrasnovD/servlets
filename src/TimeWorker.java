import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/hello")
public class TimeWorker extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Date date = new Date();

        /*req.getSession().setAttribute("date", "date");
        req.getSession().setAttribute("test",123);
        getServletContext().getRequestDispatcher("/time.jsp").forward(req, resp);
        resp.setContentType ("text/plain");  // Устанавливаем тип содержимого ответа, чтобы js знал, чего ожидать.
        resp.setCharacterEncoding ("UTF-8");  // Вы хотите русские буквы?
        resp.getWriter().write("asdfg");  // Записываем тело ответа.*/
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>HelloWorld</title>");
        out.print("<body>");
        out.println("<h3>qwert"+req.getParameter("test") + "</h3>");
        out.print("</body>");

        out.close();
    }
}