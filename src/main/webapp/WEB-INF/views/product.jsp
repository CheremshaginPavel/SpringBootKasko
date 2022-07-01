<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Product list</title>
</head>
<body>
<h1 align="center">Products</h1>
<br/>
<table border="2" cellpadding="10">
    <colgroup>
        <col span="2" style="background: khaki">
        <col style="background-color: lightcyan">
    </colgroup>
    <caption>
        Table of products
    </caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <jsp:useBean id="products" scope="request" type="com.example.KaskoWebClient.Model.KaskoAPI.Response.Products"/>
    <c:forEach var="contact" items="${products}">
        <tr>
            <th>${contact.id}</th><th>${contact.name}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>