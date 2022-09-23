<%--
  Created by IntelliJ IDEA.
  User: Pominov7
  Date: 18.09.2022
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Задание 5</title>
</head>
<body style="vertical-align: middle; text-align: center">
<form action="calculator" method="post" style="margin: 10px">
    <h1>Калькулятор</h1>
    <br>
    <br>
    <label>
        <input type="number" id="num-1" name="num_1" style="margin: 5px">
    </label>

    <select name="choice-operations">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
        <option value="^">^</option>
        <option value="%">%</option>
    </select>

    <label>
        <input type="number" id="num-2" name="num_2" style="margin: 5px">
    </label>
    <label>
        =
        <input type="text" name="result" style="margin: 5px" disabled value="${result}">
    </label>

    <button>
        Получить результат
    </button>

</form>
</body>
</html>
