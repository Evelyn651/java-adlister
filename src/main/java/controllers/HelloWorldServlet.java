package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "controllers.HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        String name = request.getParameter("name");

        if(name == null){
            name = "World";
        }else if(name.equals("bgates")){
            response.sendRedirect("https://microsoft.com");
            return;
        }

        //these lines create fields in the request to be used int he front end (views)
        request.setAttribute("name", name.toUpperCase());
        request.setAttribute("tea", "green");
        //connects the controller with the view

        request.getRequestDispatcher("/hello.jsp").forward(request, response);

    }

}
