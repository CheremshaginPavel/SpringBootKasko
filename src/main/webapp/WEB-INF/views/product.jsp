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
<table border="3" cellpadding="10">
    <colgroup>
        <col span="2" style="background: khaki">
        <col style="background-color: lightcyan">
    </colgroup>
    <caption>
        Table of products
    </caption>
    <tr>
        <th>#</th>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <jsp:useBean id="elements" scope="request" type="java.util.Map"/>
    <c:forEach var="contact" items="${elements}">
        <tr>
            <ol type="1">
                <th>${contact}</th><th>${contact.key}</th><th>${contact.value}</th>
            </ol>
        </tr>
    </c:forEach>
</table>
</body>
</html>