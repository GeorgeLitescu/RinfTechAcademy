package com.georgelitescu.servlets.authenticator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "authServlet", value = "/auth")

public class AuthServlet extends HttpServlet {

    private Map<String, String> credentials;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        credentials = new HashMap<>();
        credentials.put("Maria", "abcdef");
        credentials.put("Ion", "qwerty");
        credentials.put("George", "123456");
        credentials.put("Ana", "password");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String requestUser = request.getParameter("username");
        String requestPass = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(createResponseMessage(requestUser, requestPass));
        out.println("</body></html>");
    }

    private String createResponseMessage(String requestUser, String requestPass) {
/*        return credentials.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(requestUser) &&
                        entry.getValue().equals(requestPass))
                .findFirst()
                .map(entry -> "Name/Password Match")
                .orElse("Name/Password Does Not Match");
                */

        if (credentials.containsKey(requestUser) && credentials.get(requestUser).equals(requestPass))
            return "Name/Password Match";
        return "Name/Password Does Not Match";
    }


    public void destroy() {
    }
}
