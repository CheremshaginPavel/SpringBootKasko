<%@ page import="com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.AutoCalcRq" %>
<%@ page import="com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.AutoDescription" %>
<%@ page import="com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.ModelDescription" %>
<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Sample Kasko API</title>
    </head>
    <body>
        <form name="StartingForm" action="calc.jsp" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>Новое ТС?:</td>
                        <td><input type="checkbox" name="NewTs"/></td>
                    </tr>
                    <tr>
                        <td>Срок службы:</td>
                        <td><input type="text" name="MileAge"/></td>
                    </tr>
                    <tr>
                        <td>Марка автомобиля:</td>
                        <td><input type="text" name="MarkName"/></td>
                    </tr>
                    <tr>
                        <td>Модель автомобиля:</td>
                        <td><input type="text" name="ModelName"/></td>
                    </tr>
                    <tr>
                        <td>Количество лошадиных сил:</td>
                        <td><input type="text" name="horsepower"/></td>
                    </tr>
                    <tr>
                        <td>Год выпуска:</td>
                        <td><input type="text" name="year"/></td>
                    </tr>
                    <tr>
                        <td>Положение руля:</td>
                        <td><input type="text" name="side"/></td>
                    </tr>
                    <tr>
                        <td>ID марки:</td>
                        <td><input type="text" name="markId"/></td>
                    </tr>
                    <tr>
                        <td>ID модели:</td>
                        <td><input type="text" name="modelId"/></td>
                    </tr>
                    <tr>
                        <td>Установлен рекомендованный ПУУ:</td>
                        <td><input type="checkbox" name="recommendedPuu"/></td>
                    </tr>
                    <tr>
                        <td>Сумма в рублях:</td>
                        <td><input type="text" name="sum"/></td>
                    </tr>
                    <tr>
                        <td>Номер региона:</td>
                        <td><input type="text" name="regionId"/></td>
                    </tr>
                    <tr>
                        <td>Название банка:</td>
                        <td><input type="text" name="bankName"/></td>
                    </tr>
                    <tr>
                        <td>ID банка:</td>
                        <td><input type="text" name="bankId"/></td>
                    </tr>
                </tbody>
            </table>
            <input type="reset" name="Clear" value="Очистить">
            <input type="submit" value="Отправить">
        </form>
    </body>
</html>