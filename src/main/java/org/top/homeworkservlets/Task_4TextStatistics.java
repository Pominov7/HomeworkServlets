package org.top.homeworkservlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Task_4TextStatistics", value = "/statsByText")
public class Task_4TextStatistics extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.sendRedirect(request.getContextPath() + "/Task4TextStatistic.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {

            String inputText = request.getParameter("inputText");
            response.getWriter().println("Vowels in the text: " + ParsingSentences.vowelsString(inputText));
            response.getWriter().println("Consonants in the text: " + ParsingSentences.consonantsString(inputText));
            response.getWriter().println("Punctuation marks: " + ParsingSentences.punctuationString(inputText));

            request.setAttribute("vowelsString", ParsingSentences.vowelsString(inputText));
            request.setAttribute("consonantsString", ParsingSentences.consonantsString(inputText));
            request.setAttribute("punctuationString", ParsingSentences.punctuationString(inputText));
            getServletContext().getRequestDispatcher("/Task4TextStatistics.jsp").forward(request, response);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


