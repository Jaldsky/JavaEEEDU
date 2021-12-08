import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ThirdServlet")
public class ThirdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.sendRedirect("/thirdJSP.jsp"); //Обычный redirect, можно перенаправлять как на внутренние так и на внешние ресурсы

        RequestDispatcher dispatcher = request.getRequestDispatcher("/thirdJSP.jsp"); //Пример Forward'а
        dispatcher.forward(request, response); //Пример Forward'а
    }
}
