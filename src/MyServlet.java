import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String about = request.getParameter("about");
        PrintWriter writer = response.getWriter();
        String res = "<html>";
        res += "<h2>Name: " + username + "<br/>";
        res += "Password: " + password + "</h2>";
        res += "About you: " + about + "</h2>";
        res += "</html>";
        writer.println(res);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Hello, " + name + " " + surname +"</h1>");
        pw.println("</html>");
    }
}
