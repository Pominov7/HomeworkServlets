package org.top.homeworkservlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Task_1QuoteTorvalds", value = "/quotaLinusTorvalds")
public class Task_1QuoteTorvalds extends HttpServlet {

    private String message;

    public void init() {
        message = "Bad programmers worry about the code. Good programmers\n" +
                "worry about data structures and their relationships\n";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.getRequestDispatcher("/Task1QuoteTorvald.jsp");
        PrintWriter out = response.getWriter();
        out.println(message);
    }
}