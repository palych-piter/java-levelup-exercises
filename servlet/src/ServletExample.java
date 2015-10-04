import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Andrey on 10/3/2015.
 */
public class ServletExample extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = new PrintWriter(response.getWriter());
        out.println("Hello Kabachki!!!");
    }
}
