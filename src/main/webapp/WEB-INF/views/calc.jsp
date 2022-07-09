<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="autoCalcResponse" scope="request" type="com.example.KaskoWebClient.model.api.responses.CalcResponse.AutoCalcResponse"/>
<jsp:useBean id="autoCalcRs" scope="request" type="java.lang.String"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<c:forEach var="elem" items="${autoCalcResponse.autoCalcRS.warnings}">
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
<div style="padding-left: 20px">Тип услуги: <strong>${autoCalcResponse.autoCalcRS.calcType}</strong></div>
<%--<div style="padding-left: 20px">Дата создания запроса: <strong>${autoCalcResponse.autoCalcRS.calcDate}></strong></div>--%>
<div style="padding-left: 20px">Флаг "Транзит": <strong>${autoCalcResponse.autoCalcRS.transit}</strong></div>
<div style="padding-left: 20px">Флаг "Тахограф": <strong>${autoCalcResponse.autoCalcRS.tachograph}</strong></div>
<div style="padding-left: 20px">Территория использования коммерческих ТС: <strong>${autoCalcResponse.autoCalcRS.territoryId}</strong></div>
<div style="padding-left: 20px">ID модели: <strong>${autoCalcResponse.autoCalcRS.modelId}</strong></div>
<div style="padding-left: 20px">ID марки: <strong>${autoCalcResponse.autoCalcRS.markId}</strong></div>
<div style="padding-left: 20px">Наименование марки: <strong>${autoCalcResponse.autoCalcRS.markName}</strong></div>
<div style="padding-left: 20px">Наименование модели: <strong>${autoCalcResponse.autoCalcRS.modelName}</strong></div>
<div style="padding-left: 20px">ID префикса коммерческих ТС: <strong>${autoCalcResponse.autoCalcRS.prefixComTsId}</strong></div>
<div style="padding-left: 20px">Наименование префикса коммерческих ТС: <strong>${autoCalcResponse.autoCalcRS.prefixComTsName}</strong></div>
<div style="padding-left: 20px">ID типа коммерческих ТС: <strong>${autoCalcResponse.autoCalcRS.typeComTsId}</strong></div>
<div style="padding-left: 20px">Наименование типа коммерческих ТС: <strong>${autoCalcResponse.autoCalcRS.typeComTsName}</strong></div>
<div style="padding-left: 20px">Категория транспортного средства: <strong>${autoCalcResponse.autoCalcRS.category}</strong></div>
<div style="padding-left: 20px">Ввод марки и модели не из справочника: <strong>${autoCalcResponse.autoCalcRS.anotherMm}</strong></div>
<div style="padding-left: 20px">Наименование марки ТС (ручной ввод): <strong>${autoCalcResponse.autoCalcRS.anotherMarkName}</strong></div>
<div style="padding-left: 20px">Наименование модели (ручной ввод): <strong>${autoCalcResponse.autoCalcRS.anotherModelName}</strong></div>
<div style="padding-left: 20px">Изготовитель: <strong>${autoCalcResponse.autoCalcRS.manufacturer}</strong></div>
<div style="padding-left: 35px">Валюта рассчитанной премии: <strong>${autoCalcResponse.autoCalcRS.totalSumm.currency}</strong></div>
<div style="padding-left: 35px">Рассчитанная премия: <strong>${autoCalcResponse.autoCalcRS.totalSumm.sum}</strong></div>
<c:forEach var="elem" items="${autoCalcResponse.autoCalcRS.risks}">
    <tr>
        <th><div style="padding-left: 35px">ID риска: <strong>${elem.riskId}</strong></div></th>
        <th><div style="padding-left: 35px">Наименование риска: <strong>${elem.riskName}</strong></div></th>
        <th><div style="padding-left: 35px">Банк обязателен: <strong>${elem.bankRequired}</strong></div></th>
        <th><div style="padding-left: 35px">Риск обязателен: <strong>${elem.codeRequired}</strong></div></th>
        <th><div style="padding-left: 50px">Валюта страховой суммы по риску: <strong>${elem.insuredSumm.currency}</strong></div></th>
        <th><div style="padding-left: 50px">Страховая сумма по риску: <strong>${elem.insuredSumm.sum}</strong></div></th>
        <th><div style="padding-left: 50px">Валюта рассчитанной премии по риску: <strong>${elem.insuredPremium.currency}</strong></div></th>
        <th><div style="padding-left: 50px">Рассчитанная премия по риску: <strong>${elem.insuredPremium.sum}</strong></div></th>
    </tr>
</c:forEach>
<c:forEach var="elem" items="${autoCalcResponse.autoCalcRS.options}">
    <tr>
        <th><div style="padding-left: 35px">ID опции: <strong>${elem.optionId}</strong>></div></th>
        <th><div style="padding-left: 35px">Наименование опции: <strong>${elem.optionName}</strong></div></th>
        <th><div style="padding-left: 35px">ID риска: <strong>${elem.riskId}</strong></div></th>
        <th><div style="padding-left: 35px">ID группы опций: <strong>${elem.optionGroupId}</strong></div></th>
        <th><div style="padding-left: 35px">Обязательность группы опций: <strong>${elem.groupOptionRequired}</strong></div></th>
        <th><div style="padding-left: 35px">Исключительность группы опций: <strong>${elem.groupOptionEx}</strong></div></th>
        <th><div style="padding-left: 35px">Номер опции: <strong>${elem.optionNumber}</strong></div></th>
        <th><div style="padding-left: 35px">Вариант ограничение пробега для продукта КиберКАСКО: <strong>${elem.valueOption}</strong></div></th>
    </tr>
</c:forEach>
<div style="padding-left: 35px">Размер КВ агента, использованный для расчета: <strong>${autoCalcResponse.autoCalcRS.insurance.kvSize}</strong></div>
<div style="padding-left: 35px">Максимальный размер КВ по договору агента: <strong>${autoCalcResponse.autoCalcRS.insurance.kvSizeMax}</strong></div>
<div style="padding-left: 35px">Период страхования: <strong>${autoCalcResponse.autoCalcRS.insurance.term_insurance}</strong></div>
<div style="padding-left: 20px">Индекс: <strong>${autoCalcResponse.autoCalcRS.factor}<?</div>
    <div style="padding-left: 20px">Измененные объекты: <strong>${autoCalcResponse.autoCalcRS.changedConditions}</strong></div>
    <div style="padding-left: 20px">Id экспресс-расчета: <strong>${autoCalcResponse.autoCalcRS.expressQuotationId}</strong></div>
    <div style="padding-left: 20px">URL экспресс-расчета: <strong>${autoCalcResponse.autoCalcRS.expressQuotationUrl}</strong></div>
    <div style="padding-left: 20px">ID калькуляции: <strong>${autoCalcResponse.autoCalcRS.calculationId}</strong></div>
<br/>
${autoCalcRs}
</body>
</html>