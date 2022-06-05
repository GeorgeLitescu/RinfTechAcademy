package com.georgelitescu.servlets.fileUploader;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "upload", value = "/upload")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 100
)
public class UploadServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<String> fileNames = new ArrayList<>();

        //boolean overwrite = request.getParameter("overwrite").equals("true");
            //i tried for literally half a day to implement overwrite but i get a NullPointerException everytime
            //i will continue research on this one but i already lost way too much time on it

        Part filePart = request.getPart("file");
        String fileName = filePart.getSubmittedFileName();

        if (!fileNames.contains(fileName) /* || overwrite */) {
            fileNames.add(fileName);

            for (Part part : request.getParts()) {
                part.write("C:\\upload\\" + fileName);
            }

            response.getWriter().print("File Written");
        } else response.getWriter().print("File already exists and Overwrite not checked");
    }

    public void destroy() {
    }
}
