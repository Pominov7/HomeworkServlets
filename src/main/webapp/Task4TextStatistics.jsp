<%--
  Created by IntelliJ IDEA.
  User: Pominov7
  Date: 18.09.2022
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Задание 4</title>
</head>
<body style="vertical-align: middle; text-align: center">
<h1>Задание 4: Статистика по введеному тексту</h1>
<a style="margin: 10px;" href="${pageContext.request.contextPath}/index.jsp">Возврат в предыдущее меню</a>

<form action="statsByText" method="post" style="margin: 10px">
    <h2>Введите текст</h2>

    <label>
        <textarea id="input_Text" name="inputText" rows="4" cols="50">Some text...</textarea>
    </label>
    <br>
    <label>
        <br>
        <input type="submit" id="vowels_String" name="inputText" style="margin: 5px" value="Гласные:${vowelsString}">
    </label>
    <br>
    <label>
        <br>
        <input type="submit" id="consonants_String" name="inputText" style="margin: 5px"
               value="Согласные:${consonantsString}">
    </label>
    <br>
    <label>
        <br>
        <input type="submit" id="punctuation_String" name="inputText" style="margin: 5px"
               value="Знаки препинания:${punctuationString}">
    </label>

</form>
</body>
</html>
