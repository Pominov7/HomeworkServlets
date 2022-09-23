<%--
  Created by IntelliJ IDEA.
  User: Pominov7
  Date: 16.09.2022
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Задание 2</title>
</head>
<body style="vertical-align: middle; text-align: center">
<h1>Задание 2: Максимум из трёх чисел</h1>

<a style="margin: 10px;" href="${pageContext.request.contextPath}/index.jsp">Возврат в предыдущее меню</a>

<form action="maxNumber" method="post" style="margin: 10px;">
    <label>
        Ввод числа 1:
        <input type="number" id="num1" name="field_num_1" style="margin: 5px">
    </label>
    <br>
    <label>
        Ввод числа 2:
        <input type="number" id="num2" name="field_num_2" style="margin: 5px">
    </label>
    <br>
    <label>
        Ввод числа 3:
        <input type="number" id="num3" name="field_num_3" style="margin: 5px">
    </label>
    <br>
    <label>
        Максимальное
        <input type="text" name="result" style="margin-right: 8px" disabled value="${result}">
    </label>
    <br>
    <br>
    <button style="margin-left: 100px">
        Получить результат
    </button>
</form>
<hr>
</body>
</html>
