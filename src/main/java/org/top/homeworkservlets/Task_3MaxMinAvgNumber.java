package org.top.homeworkservlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.stream.Stream;

@WebServlet(name = "Task_3MaxMinAvgNumber", value = "/maxMinAvgNumber")

public class Task_3MaxMinAvgNumber extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        getServletContext().getRequestDispatcher("/Task3MaxMinAvgNumber.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            double num_1 = Double.parseDouble(request.getParameter("num_1"));
            double num_2 = Double.parseDouble(request.getParameter("num_2"));
            double num_3 = Double.parseDouble(request.getParameter("num_3"));
            String choice = request.getParameter("choice");

            double result = switch (choice) {
                case "max" -> maxOfNumber(num_1, num_2, num_3);
                case "min" -> minOfNumber(num_1, num_2, num_3);
                case "avg" -> avgOfNumber(num_1, num_2, num_3);
                default -> throw new Exception();
            };
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/Task3MaxMinAvgNumber.jsp").forward(request, response);

        } catch (Exception ex) {
            // перенаправление запроса на страницу с ошибкой
            ServletContext sContext = getServletContext();
            RequestDispatcher rDispatcher =
                    sContext.getRequestDispatcher("/ErrorServlet");
            rDispatcher.forward(request, response);
        }
    }

    public Double maxOfNumber(double num_1, double num_2, double num_3) {
        return Stream.of(num_1, num_2, num_3).reduce(Math::max).get();
    }

    public Double minOfNumber(double num_1, double num_2, double num_3) {
        return Stream.of(num_1, num_2, num_3).reduce(Math::min).get();
    }

    public Double avgOfNumber(double num_1, double num_2, double num_3) {
        return (num_1 + num_2 + num_3) / 3;
    }
}
