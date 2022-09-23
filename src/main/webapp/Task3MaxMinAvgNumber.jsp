<%--
  Created by IntelliJ IDEA.
  User: Pominov7
  Date: 18.09.2022
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Задание 3</title>
</head>

<body style="vertical-align: middle; text-align: center">
<h1>Задание 3: Максимум, минимум, среднее арифметическое из трёх чисел</h1>
<a style="margin: 10px;" href="${pageContext.request.contextPath}/index.jsp">Возврат в предыдущее меню</a>

<form action="maxMinAvgNumber" method="post" style="margin: 10px">

    <label>
        Число 1:
        <input type="number" id="num1" name="num_1" style="margin: 5px">
    </label>
    <br>
    <label>
        Число 2:
        <input type="number" id="num2" name="num_2" style="margin: 5px">
    </label>
    <br>
    <label>
        Число 3:
        <input type="number" id="num3" name="num_3" style="margin: 5px">
    </label>
    <br>
    <label>
        Результат
        <input type="text" name="result" style="margin-right: 8px" disabled value="${result}">
    </label>
    <br>
    <input type="radio" id="max"
           name="choice" value="max" checked>
    <label for="max">Maximum</label>

    <input type="radio" id="min"
           name="choice" value="min">
    <label for="min">Minimum</label>

    <input type="radio" id="avg"
           name="choice" value="avg">
    <label for="avg">Average</label>
    <br>
    <br>
    <button style="margin-left: 65px">
        Получить результат
    </button>
    <br>
</form>
</body>
</html>
