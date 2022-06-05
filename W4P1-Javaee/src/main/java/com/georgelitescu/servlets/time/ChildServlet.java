package com.georgelitescu.servlets.time;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(name = "coolerTimeServlet", value = "/cooler-time")
public class ChildServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setIntHeader("Refresh", 1);


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + LocalDateTime.now() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
