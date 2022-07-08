<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Sample Kasko API - 1</title>
    </head>
    <body>
        <%--@elvariable id="autoCalcRq" type="AutoCalcRq"--%>
        <form:form action="/calc" method="post" modelAttribute="autoCalcRq">
            <table>
                <tbody>
                    <tr>
                        <td>Новое ТС?:</td>
                        <td><input type="checkbox" name="auto.modelDescription.tsNew"/></td>
                    </tr>
                    <tr>
                        <td>Срок службы:</td>
                        <td><input type="text" name="auto.modelDescription.mileAge"/></td>
                    </tr>
                    <tr>
                        <td>Марка автомобиля:</td>
                        <td><input type="text" name="auto.modelDescription.markName"/></td>
                    </tr>
                    <tr>
                        <td>Модель автомобиля:</td>
                        <td><input type="text" name="auto.modelDescription.modelName"/></td>
                    </tr>
                    <tr>
                        <td>Количество лошадиных сил:</td>
                        <td><input type="text" name="auto.modelDescription.horsepower"/></td>
                    </tr>
                    <tr>
                        <td>Год выпуска:</td>
                        <td><input type="text" name="auto.modelDescription.year"/></td>
                    </tr>
                    <tr>
                        <td>Положение руля:</td>
                        <td><input type="text" name="auto.modelDescription.sterringWheel.side"/></td>
                    </tr>
                    <tr>
                        <td>Установлен рекомендованный ПУУ:</td>
                        <td><input type="checkbox" name="auto.modelDescription.securityJa.recommendedPuu"/></td>
                    </tr>
                    <tr>
                        <td>Сумма в рублях:</td>
                        <td><input type="text" name="auto.price.sum"/></td>
                    </tr>
                    <tr>
                        <td>Номер региона:</td>
                        <td><input type="text" name="regionId"/></td>
                    </tr>
                    <tr>
                        <td>Название банка:</td>
                        <td><input type="text" name="creditBank.bankName"/></td>
                    </tr>
                </tbody>
            </table>
            <input type="reset" name="Clear" value="Очистить">
            <input type="submit" value="Отправить">
        </form:form>
    </body>
</html>