import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class LibraryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter(); //нужен для вовода
        try {
            Class.forName("org.postgresql.Driver"); //подключаем драйвер для бд
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:2021/java_ee_db",
                    "postgres", "root"); //устанавливаем соединение с бд

            Statement statement = connection.createStatement(); //создаем состояние
            ResultSet rs = statement.executeQuery("select title from books"); //в состоянии задаем запрос

            while (rs.next()){ //выводим данные с бд
                pw.println(rs.getString("title"));
            }
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
