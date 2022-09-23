package org.top.homeworkservlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Task_5Calculator", value = "/calculator")
public class Task_5Calculator extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath() + "/Task5Calculator.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            double num_1 = Double.parseDouble(request.getParameter("num_1"));
            double num_2 = Double.parseDouble(request.getParameter("num_2"));

            String choice = request.getParameter("choice-operations");

            double result = switch (choice) {
                case "+" -> num_1 + num_2;
                case "-" -> num_1 - num_2;
                case "*" -> num_1 * num_2;
                case "/" -> num_1 / num_2;
                case "^" -> Math.pow(num_1, num_2);
                case "%" -> (num_2 * num_1) / 100;
                default -> throw new Exception();
            };

            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/Task5Calculator.jsp").forward(request, response);

        } catch (Exception ex) {
            // перенаправление запроса на страницу с ошибкой
            ServletContext sContext = getServletContext();
            RequestDispatcher rDispatcher =
                    sContext.getRequestDispatcher("/ErrorServlet");
            rDispatcher.forward(request, response);
        }
    }
}


