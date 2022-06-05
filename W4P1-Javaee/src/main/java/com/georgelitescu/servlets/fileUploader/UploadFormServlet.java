package com.georgelitescu.servlets.fileUploader;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "uploadForm", value = "/upload-form")
public class UploadFormServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form method=\"post\" action=\"upload\" enctype=\"multipart/form-data\">\n" +
                "    <input type=\"file\" name=\"file\" /><br/>\n" +
                "    <input type=\"submit\" value=\"Upload\" />\n" +
                "    <input type=\"checkbox\" name=\"overwrite\" value =\"true\" />Overwrite" +
                "  </form>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
