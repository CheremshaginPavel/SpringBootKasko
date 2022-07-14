<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="autoCalcResp" scope="request" type="com.example.KaskoWebClient.model.api.responses.CalcResponse.AutoCalcResponse"/>
<jsp:useBean id="autoCalcRes" scope="request" type="java.lang.String"/>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<c:forEach var="elem" items="${autoCalcResp.autoCalcRS.warnings}">
    <tr>
        <th>
            <div style="padding-left: 35px">
                <span style="color: blue">
                    Cообщение-предупреждение:
                    <span style="color: coral">
                            ${elem.message} (${elem.messageId})
                    </span>
                </span>
            </div>
        </th>
    </tr>
</c:forEach>
<% if (autoCalcResp.getAutoCalcRS().getCalcType() != null) { %>
    <div style="padding-left: 20px">Тип услуги: <strong>${autoCalcResp.autoCalcRS.calcType}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getCalcDate() != null) { %>
    <div style="padding-left: 20px">Дата создания запроса: <strong>${autoCalcResp.autoCalcRS.calcDate}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getTransit() != null) { %>
    <div style="padding-left: 20px">Флаг "Транзит": <strong>${autoCalcResp.autoCalcRS.transit}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getTachograph() != null) { %>
    <div style="padding-left: 20px">Флаг "Тахограф": <strong>${autoCalcResp.autoCalcRS.tachograph}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getTerritoryId() != null) { %>
    <div style="padding-left: 20px">Территория использования коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.territoryId}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getModelId() != null) { %>
    <div style="padding-left: 20px">ID модели: <strong>${autoCalcResp.autoCalcRS.modelId}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getMarkId() != null) { %>
    <div style="padding-left: 20px">ID марки: <strong>${autoCalcResp.autoCalcRS.markId}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getMarkName() != null) { %>
    <div style="padding-left: 20px">Наименование марки: <strong>${autoCalcResp.autoCalcRS.markName}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getModelName() != null) { %>
    <div style="padding-left: 20px">Наименование модели: <strong>${autoCalcResp.autoCalcRS.modelName}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getPrefixComTsId() != null) { %>
    <div style="padding-left: 20px">ID префикса коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.prefixComTsId}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getPrefixComTsName() != null) { %>
    <div style="padding-left: 20px">Наименование префикса коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.prefixComTsName}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getTypeComTsId() != null) { %>
    <div style="padding-left: 20px">ID типа коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.typeComTsId}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getTypeComTsName() != null) { %>
    <div style="padding-left: 20px">Наименование типа коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.typeComTsName}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getCategory() != null) { %>
    <div style="padding-left: 20px">Категория транспортного средства: <strong>${autoCalcResp.autoCalcRS.category}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getAnotherMm() != null) { %>
    <div style="padding-left: 20px">Ввод марки и модели не из справочника: <strong>${autoCalcResp.autoCalcRS.anotherMm}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getAnotherMarkName() != null) { %>
    <div style="padding-left: 20px">Наименование марки ТС (ручной ввод): <strong>${autoCalcResp.autoCalcRS.anotherMarkName}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getAnotherModelName() != null) { %>
    <div style="padding-left: 20px">Наименование модели (ручной ввод): <strong>${autoCalcResp.autoCalcRS.anotherModelName}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getManufacturer() != null) { %>
    <div style="padding-left: 20px">Изготовитель: <strong>${autoCalcResp.autoCalcRS.manufacturer}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getTotalSumm().getCurrency() != null) { %>
    <div style="padding-left: 35px">Валюта рассчитанной премии: <strong>${autoCalcResp.autoCalcRS.totalSumm.currency}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getTotalSumm().getSum() != null) { %>
    <div style="padding-left: 35px">Рассчитанная премия: <strong>${autoCalcResp.autoCalcRS.totalSumm.sum}</strong></div>
<%}%>
<c:forEach var="elem" items="${autoCalcResp.autoCalcRS.risks}">
    <tr>
        <th><div style="padding-left: 35px">ID риска: <strong>${elem.riskId}</strong></div></th>
        <th><div style="padding-left: 35px">Наименование риска: <strong>${elem.riskName}</strong></div></th>
        <th><div style="padding-left: 35px">Риск обязателен: <strong>${elem.codeRequired}</strong></div></th>
        <th><div style="padding-left: 50px">Валюта страховой суммы по риску: <strong>${elem.insuredSumm.currency}</strong></div></th>
        <th><div style="padding-left: 50px">Страховая сумма по риску: <strong>${elem.insuredSumm.sum}</strong></div></th>
        <th><div style="padding-left: 50px">Валюта рассчитанной премии по риску: <strong>${elem.insuredPremium.currency}</strong></div></th>
        <th><div style="padding-left: 50px">Рассчитанная премия по риску: <strong>${elem.insuredPremium.sum}</strong></div></th>
    </tr>
</c:forEach>
<c:forEach var="elem" items="${autoCalcResp.autoCalcRS.options}">
    <tr>
        <th><div style="padding-left: 35px">ID опции: <strong>${elem.optionId}</strong></div></th>
        <th><div style="padding-left: 35px">Наименование опции: <strong>${elem.optionName}</strong></div></th>
        <th><div style="padding-left: 35px">ID риска: <strong>${elem.riskId}</strong></div></th>
        <th><div style="padding-left: 35px">ID группы опций: <strong>${elem.optionGroupId}</strong></div></th>
        <th><div style="padding-left: 35px">Обязательность группы опций: <strong>${elem.groupOptionRequired}</strong></div></th>
        <th><div style="padding-left: 35px">Исключительность группы опций: <strong>${elem.groupOptionEx}</strong></div></th>
        <th><div style="padding-left: 35px">Номер опции: <strong>${elem.optionNumber}</strong></div></th>
        <th><div style="padding-left: 35px">Вариант ограничение пробега для продукта КиберКАСКО: <strong>${elem.valueOption}</strong></div></th>
    </tr>
</c:forEach>
<% if (autoCalcResp.getAutoCalcRS().getInsurance() != null) { %>
    <% if (autoCalcResp.getAutoCalcRS().getInsurance().getKvSize() != null) { %>
        <div style="padding-left: 35px">Размер КВ агента, использованный для расчета: <strong>${autoCalcResp.autoCalcRS.insurance.kvSize}</strong></div>
    <%}%>
    <% if (autoCalcResp.getAutoCalcRS().getInsurance().getKvSizeMax() != null) { %>
        <div style="padding-left: 35px">Максимальный размер КВ по договору агента: <strong>${autoCalcResp.autoCalcRS.insurance.kvSizeMax}</strong></div>
    <%}%>
    <% if (autoCalcResp.getAutoCalcRS().getInsurance().getTerm_insurance() != null) { %>
        <div style="padding-left: 35px">Период страхования: <strong>${autoCalcResp.autoCalcRS.insurance.term_insurance}</strong></div>
    <%}%>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getFactor() != null) { %>
    <div style="padding-left: 20px">Индекс: <strong>${autoCalcResp.autoCalcRS.factor}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getChangedConditions() != null) { %>
    <div style="padding-left: 20px">Измененные объекты: <strong>${autoCalcResp.autoCalcRS.changedConditions}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getExpressQuotationId() != null) { %>
    <div style="padding-left: 20px">Id экспресс-расчета: <strong>${autoCalcResp.autoCalcRS.expressQuotationId}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getExpressQuotationUrl() != null) { %>
    <div style="padding-left: 20px">URL экспресс-расчета: <strong>${autoCalcResp.autoCalcRS.expressQuotationUrl}</strong></div>
<%}%>
<% if (autoCalcResp.getAutoCalcRS().getCalculationId() != null) { %>
    <div style="padding-left: 20px">ID калькуляции: <strong>${autoCalcResp.autoCalcRS.calculationId}</strong></div>
<%}%>
<br/>
${autoCalcRes}
</body>
</html>