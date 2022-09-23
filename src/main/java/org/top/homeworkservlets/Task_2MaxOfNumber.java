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

@WebServlet(name = "Task_2MaxOfNumber", value = "/maxNumber")
public class Task_2MaxOfNumber extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath() + "/Task2MaxOfThreeNumbers.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int num_1 = Integer.parseInt(request.getParameter("field_num_1"));
            int num_2 = Integer.parseInt(request.getParameter("field_num_2"));
            int num_3 = Integer.parseInt(request.getParameter("field_num_3"));
            request.setAttribute("result", maxOfNumber(num_1, num_2, num_3));
            getServletContext().getRequestDispatcher("/Task2MaxOfThreeNumbers.jsp").forward(request, response);

        } catch (Exception ex) {
            // перенаправление запроса на страницу с ошибкой
            ServletContext sContext = getServletContext();
            RequestDispatcher rDispatcher =
                    sContext.getRequestDispatcher("/ErrorServlet");
            rDispatcher.forward(request, response);
        }
    }

    public Integer maxOfNumber(int num_1, int num_2, int num_3) {
        return Stream.of(num_1, num_2, num_3).reduce(Math::max).get();
    }
}