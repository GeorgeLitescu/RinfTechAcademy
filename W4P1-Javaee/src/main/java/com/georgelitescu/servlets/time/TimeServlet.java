package com.georgelitescu.servlets.time;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "timeServlet", value = "/time")

public class TimeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setIntHeader("Refresh", 5);

        try {
            request.getRequestDispatcher("/cooler-time").include(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<br/>" +
                "<a href = \"cooler-time\">My faster updating brother</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}