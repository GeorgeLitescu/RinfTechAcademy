package com.georgelitescu.servlets.header;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "getHeader", value = "/get-header")

public class GetHeader extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Enumeration<String> headers;
        response.setContentType("text/html");

        headers = request.getHeaderNames();

        while (headers.hasMoreElements())
            response.getWriter().println(headers.nextElement());

    }

}
