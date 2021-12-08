import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import pacageCart.Cart;

@WebServlet(name = "FourthServlet")
public class FourthServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));



        Integer userSession = (Integer) session.getAttribute("session");
        if (userSession == null){
            session.setAttribute("session", 1);
            userSession = 1;
        } else {
           session.setAttribute("session", userSession + 1);
        };



        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null){
            cart = new Cart();

            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);



//        Integer count = (Integer) session.getAttribute("count");
//        if (count == null) {
//            session.setAttribute("count", 1);
//            count = 1;
//        }
//        else {
//            session.setAttribute("count", count + 1);
//             }
//        PrintWriter pw = response.getWriter();
//
//        pw.println("<html><head> </head> <body>");
//        pw.println("<h1>Your counter is " + count + "<h1>");
//        pw.println("</body></html>");



        //Пример авторизации
//        String user = session.getAttribute("current_user");
//        if (user == null){
//            //response для анонимного пользователя
//            //авторизация
//            //регистрация
//            session.setAttribute("current_user", ID);
//        } else {
//            //response для авторизованного пользователя
//        }

    }
}
