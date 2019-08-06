import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import javax.servlet.annotation.*;
@WebServlet("/quickservlet") 
public class QuickServlet extends HttpServlet {
/**
* this life-cycle method is invoked when this servlet is first accessed
* by the client
*/
public void init(ServletConfig config) {
    System.out.println("Servlet is being initialized");
}
/**
* handles HTTP GET request
*/
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws IOException {
    PrintWriter writer = response.getWriter();
    writer.println("<html>Hello, I am a Java servlet!</html>");
    writer.flush();
}
/**
* handles HTTP POST request
*/
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws IOException {
  
     String paramWidth = request.getParameter("width");
// int width = Integer.parseInt(paramWidth);
    String paramHeight = request.getParameter("height");
// int height = Integer.parseInt(paramHeight);
    long area = calculate(paramWidth, paramHeight);
    long addition = add(paramWidth, paramHeight);
    long subtraction = subtract(paramWidth, paramHeight);
    long division = divide(paramWidth, paramHeight);

    PrintWriter writer = response.getWriter();
    if (request.getParameter("calculate") != null) {
        writer.println("<html>Area of the rectangle is: " + area + "</html>");
    }
    else if (request.getParameter("add") != null) {
        writer.println("<html>addition of the values: " + addition + "</html>");
    }
    else if (request.getParameter("subtract") != null) {
        writer.println("<html>subtraction of the values: " + subtraction + "</html>");
    }
    else if (request.getParameter("divide") != null) {
        writer.println("<html>division of the values: " + division + "</html>");
    }
    writer.flush();
}
/**
* this life-cycle method is invoked when the application or the server
* is shutting down
*/
public void destroy() {
    System.out.println("Servlet is being destroyed");
}
public long calculate(String first_value, String second_value){
    int width = Integer.parseInt(first_value);
    int height = Integer.parseInt(second_value);
    long area = width * height;
    return area;
}
public long add(String first_value, String second_value){
    int width = Integer.parseInt(first_value);
    int height = Integer.parseInt(second_value);
    long addition = width + height;
    return addition;
}
public long subtract(String first_value, String second_value){
    int width = Integer.parseInt(first_value);
    int height = Integer.parseInt(second_value);
    long subtraction = width - height;
    return subtraction;
}
public long divide(String first_value, String second_value){
    int width = Integer.parseInt(first_value);
    int height = Integer.parseInt(second_value);
    long division = width / height;
    return division;
}

 public static void main(String[] args) {
   
}
}
