package org.top.homeworkservlets;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ErrorServlet", value = "/ErrorServlet")
public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // обработка ошибки
        response.sendRedirect(request.getContextPath() + "/error.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // обработка ошибки
        response.sendRedirect(request.getContextPath() + "/error.jsp");
    }
}
