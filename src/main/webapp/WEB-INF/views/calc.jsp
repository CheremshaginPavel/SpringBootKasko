<jsp:useBean id="autoCalcRs" scope="request" type="com.example.KaskoWebClient.model.api.responses.CalcResponse.AutoCalcRS"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
${autoCalcRs.calcType}
</body>
</html>