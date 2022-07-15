<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<jsp:useBean id="mapMark" scope="request" type="com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq"/>--%>
<%--<jsp:useBean id="mapAcura" scope="request" type="com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq"/>--%>
<%--<jsp:useBean id="mapBentley" scope="request" type="com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq"/>--%>
<%--<jsp:useBean id="mapAlfaRomeo" scope="request" type="com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq"/>--%>
<%--<jsp:useBean id="mapAudi" scope="request" type="com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq"/>--%>
<%--<jsp:useBean id="mapBmw" scope="request" type="com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq"/>--%>
<%--<jsp:useBean id="mapHyundai" scope="request" type="com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq"/>--%>
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
                        <td>Сумма автомобиля в рублях:</td>
                        <td><input type="text" name="auto.price.sum"/></td>
                    </tr>
                    <tr>
                        <td>Наименование банка:</td>
                        <td><input type="text" name="auto.creditBank.bankName"/></td>
                    </tr>
                    <tr>
                        <td>Год покупки автомобиля:</td>
                        <td><input type="text" name="auto.modelDescription.year"/></td>
                    </tr>
                    <tr>
                        <td>Автомобиль новый:</td>
                        <td><input type="checkbox" name="auto.modelDescription.tsNew"/></td>
                    </tr>
<%--                    <tr>--%>
<%--                        <td>Марка автомобиля:</td>--%>
<%--                        <td>--%>
<%--                            <select name="auto.modelDescription.markId" >--%>
<%--                                <option></option>--%>
<%--                                <option value="1">ACURA</option>--%>
<%--                                <option value="2">ALFA ROMEO</option>--%>
<%--                                <option value="7">AUDI</option>--%>
<%--                                <option value="11">BENTLEY</option>--%>
<%--                                <option value="15">BMW</option>--%>
<%--                                <option value="23">CADILLAC</option>--%>
<%--                                <option value="28">CHERY</option>--%>
<%--                                <option value="29">CHEVROLET</option>--%>
<%--                                <option value="30">CHRYSLER</option>--%>
<%--                                <option value="31">CITROEN</option>--%>
<%--                                <option value="73">HYUNDAI</option>--%>
<%--                            </select>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
                    <tr>
                        <td>Марка автомобиля:</td>
                        <td>
                            <jsp:useBean id="mapMark" scope="request" type="java.util.HashMap"/>
                            <form:select path="auto.modelDescription.markId">
                                <c:forEach var="item" items="${mapMark}">
                                    <form:option value="${item.key}">${item.value}</form:option>
                                </c:forEach>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>Модель автомобиля:</td>
                        <td>
                            <form:select path="auto.modelDescription.modelName">
                                <c:forEach var="item" items="${mapMark}">
                                    <form:option value="${item}">${item}</form:option>
                                </c:forEach>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>Количество лошадиных сил:</td>
                        <td><input type="text" name="auto.modelDescription.horsepower"/></td>
                    </tr>
                    <tr>
                        <td>Установлен рекомендованный ПУУ:</td>
                        <td><input type="checkbox" name="auto.modelDescription.securityJa.recommendedPuu"/></td>
                    </tr>
                    <tr>
                        <td>Положение руля:</td>
                        <td><input type="text" name="auto.modelDescription.sterringWheel.side"/></td>
                    </tr>
                    <tr>
                        <td>Ваш возраст:</td>
                        <td><input type="text" name="drivers.driver.age"/></td>
                    </tr>
                    <tr>
                        <td>Пол:</td>
                        <td><input type="text" name="drivers.driver.gender"/></td>
                    </tr>
                    <tr>
                        <td>Являетесь резидентом РФ:</td>
                        <td><input type="checkbox" name="drivers.driver.resident"/></td>
                    </tr>
                    <tr>
                        <td>Опыт вождения:</td>
                        <td><input type="text" name="drivers.driver.experience"/></td>
                    </tr>
                    <tr>
                        <td>Пол страхователя:</td>
                        <td><input type="text" name="insurer.gender"/></td>
                    </tr>
                    <tr>
                        <td>Фамилия страхователя:</td>
                        <td><input type="text" name="insurer.lastName"/></td>
                    </tr>
                    <tr>
                        <td>Имя страхователя:</td>
                        <td><input type="text" name="insurer.firstName"/></td>
                    </tr>
                    <tr>
                        <td>Отчество страхователя:</td>
                        <td><input type="text" name="insurer.middleName"/></td>
                    </tr>
                    <tr>
                        <td>Дата рождения страхователя:</td>
                        <td><input type="date" name="insurer.dateOfBirth"/></td>
                    </tr>
                </tbody>
            </table>
            <input type="reset" name="Clear" value="Очистить">
            <input type="submit" value="Отправить">
        </form:form>
    </body>
</html>