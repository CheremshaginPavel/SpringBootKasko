<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="autoCalcResponse" scope="request" type="com.example.KaskoWebClient.model.api.responses.CalcResponse.AutoCalcResponse"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<c:forEach var="elem" items="${autoCalcResponse.autoCalcRS.errors}">
    <tr>
        <th>
            <div style="padding-left: 35px">
                    <span style="color: blue">
                        Id сообщения-ошибки:
                        <span style="color: coral">
                            ${elem.messageId}
                        </span>
                    </span>
            </div>
        </th>
        <th>
            <div style="padding-left: 35px">
                    <span style="color: blue">
                        Cообщение-ошибка:
                        <span style="color: coral">
                            ${elem.message}
                        </span>
                    </span>
            </div>
        </th>
    </tr>
</c:forEach>
<a href="${pageContext.request.contextPath}/policy"><br/><button>Вернуться</button></a>
</body>
</html>