package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cat")
public class CatServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        int weight = Integer.parseInt(request.getParameter("weight"));
        boolean isAngry = Boolean.parseBoolean(request.getParameter("isAngry"));

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.write(String.format("<h1>Кот - %s Вес - %s isAngry - %s</h1>", name, weight, isAngry));
        writer.close();


    }
}
