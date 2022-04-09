package com.georgelitescu.servlets.names;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Name Form", value = "/name-form")

public class NameFormServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form name=\"Name Form\" method=\"post\" action=\"./name\">\n" +
                "    First Name: <input type=\"name\" name=\"firstName\"/> <br/>\n" +
                "    Last Name: <input type=\"name\" name=\"lastName\"/> <br/>\n" +
                "    <input type=\"submit\" value=\"Submit\"/>\n" +
                "</form>");
        out.println("</body></html>");
    }


}
