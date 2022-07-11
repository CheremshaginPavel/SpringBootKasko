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
<div style="padding-left: 20px">Тип услуги: <strong>${autoCalcResp.autoCalcRS.calcType}</strong></div>
<div style="padding-left: 20px">Дата создания запроса: <strong>${autoCalcResp.autoCalcRS.calcDate}</strong></div>
<div style="padding-left: 20px">Флаг "Транзит": <strong>${autoCalcResp.autoCalcRS.transit}</strong></div>
<div style="padding-left: 20px">Флаг "Тахограф": <strong>${autoCalcResp.autoCalcRS.tachograph}</strong></div>
<div style="padding-left: 20px">Территория использования коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.territoryId}</strong></div>
<div style="padding-left: 20px">ID модели: <strong>${autoCalcResp.autoCalcRS.modelId}</strong></div>
<div style="padding-left: 20px">ID марки: <strong>${autoCalcResp.autoCalcRS.markId}</strong></div>
<div style="padding-left: 20px">Наименование марки: <strong>${autoCalcResp.autoCalcRS.markName}</strong></div>
<div style="padding-left: 20px">Наименование модели: <strong>${autoCalcResp.autoCalcRS.modelName}</strong></div>
<div style="padding-left: 20px">ID префикса коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.prefixComTsId}</strong></div>
<div style="padding-left: 20px">Наименование префикса коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.prefixComTsName}</strong></div>
<div style="padding-left: 20px">ID типа коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.typeComTsId}</strong></div>
<div style="padding-left: 20px">Наименование типа коммерческих ТС: <strong>${autoCalcResp.autoCalcRS.typeComTsName}</strong></div>
<div style="padding-left: 20px">Категория транспортного средства: <strong>${autoCalcResp.autoCalcRS.category}</strong></div>
<div style="padding-left: 20px">Ввод марки и модели не из справочника: <strong>${autoCalcResp.autoCalcRS.anotherMm}</strong></div>
<div style="padding-left: 20px">Наименование марки ТС (ручной ввод): <strong>${autoCalcResp.autoCalcRS.anotherMarkName}</strong></div>
<div style="padding-left: 20px">Наименование модели (ручной ввод): <strong>${autoCalcResp.autoCalcRS.anotherModelName}</strong></div>
<div style="padding-left: 20px">Изготовитель: <strong>${autoCalcResp.autoCalcRS.manufacturer}</strong></div>
<div style="padding-left: 35px">Валюта рассчитанной премии: <strong>${autoCalcResp.autoCalcRS.totalSumm.currency}</strong></div>
<div style="padding-left: 35px">Рассчитанная премия: <strong>${autoCalcResp.autoCalcRS.totalSumm.sum}</strong></div>
<c:forEach var="elem" items="${autoCalcResp.autoCalcRS.risks}">
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
<div style="padding-left: 35px">Размер КВ агента, использованный для расчета: <strong>${autoCalcResp.autoCalcRS.insurance.kvSize}</strong></div>
<div style="padding-left: 35px">Максимальный размер КВ по договору агента: <strong>${autoCalcResp.autoCalcRS.insurance.kvSizeMax}</strong></div>
<div style="padding-left: 35px">Период страхования: <strong>${autoCalcResp.autoCalcRS.insurance.term_insurance}</strong></div>
<div style="padding-left: 20px">Индекс: <strong>${autoCalcResp.autoCalcRS.factor}</strong></div>
    <div style="padding-left: 20px">Измененные объекты: <strong>${autoCalcResp.autoCalcRS.changedConditions}</strong></div>
    <div style="padding-left: 20px">Id экспресс-расчета: <strong>${autoCalcResp.autoCalcRS.expressQuotationId}</strong></div>
    <div style="padding-left: 20px">URL экспресс-расчета: <strong>${autoCalcResp.autoCalcRS.expressQuotationUrl}</strong></div>
    <div style="padding-left: 20px">ID калькуляции: <strong>${autoCalcResp.autoCalcRS.calculationId}</strong></div>
<br/>
${autoCalcRs}
</body>
</html>