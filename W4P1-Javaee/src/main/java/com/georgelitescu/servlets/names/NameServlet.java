package com.georgelitescu.servlets.names;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Name", value = "/name")
public class NameServlet extends HttpServlet {



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        final String requestFirstName = request.getParameter("firstName");
        final String requestLastName = request.getParameter("lastName");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Your name is:</h3>");
        out.println("<h2>" + requestFirstName + " " + requestLastName + "</h2>");
        out.println("</body></html>");
    }
}
