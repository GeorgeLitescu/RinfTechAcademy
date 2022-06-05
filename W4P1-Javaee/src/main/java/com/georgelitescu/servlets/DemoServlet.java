package com.georgelitescu.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "demoServlet", value = "/demo",
        initParams = @WebInitParam(name = "greeting", value = "Hello World"))

public class DemoServlet extends HttpServlet {
    private String message;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.message = config.getInitParameter("greeting");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
