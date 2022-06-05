package com.georgelitescu.servlets.authenticator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "authForm", value = "/auth-form")

public class AuthFormServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form name=\"loginForm\" method=\"post\" action=\"./auth\">\n" +
                "    Username: <input type=\"username\" name=\"username\"/> <br/>\n" +
                "    Password: <input type=\"password\" name=\"password\"/> <br/>\n" +
                "    <input type=\"submit\" value=\"Login\"/>\n" +
                "</form>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
