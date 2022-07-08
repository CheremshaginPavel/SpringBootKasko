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
                    Id сообщения-предупреждения:
                    <span style="color: coral">
                        ${elem.messageId}
                    </span>
                </span>
            </div>
        </th>
        <th>
            <div style="padding-left: 35px">
                <span style="color: blue">
                    Cообщение-предупреждение:
                    <span style="color: coral">
                            ${elem.message}
                    </span>
                </span>
            </div>
        </th>
    </tr>
</c:forEach>
<div style="padding-left: 20px">Тип услуги: ${autoCalcResponse.autoCalcRS.calcType}</div>
<div style="padding-left: 20px">Дата создания запроса: ${autoCalcResponse.autoCalcRS.calcDate}</div>
<div style="padding-left: 20px">Флаг "Транзит": ${autoCalcResponse.autoCalcRS.transit}</div>
<div style="padding-left: 20px">Флаг "Тахограф": ${autoCalcResponse.autoCalcRS.tachograph}</div>
<div style="padding-left: 20px">Территория использования коммерческих ТС:${autoCalcResponse.autoCalcRS.territoryId}</div>
<div style="padding-left: 20px">ID модели: ${autoCalcResponse.autoCalcRS.modelId}</div>
<div style="padding-left: 20px">ID марки: ${autoCalcResponse.autoCalcRS.markId}</div>
<div style="padding-left: 20px">Наименование марки: ${autoCalcResponse.autoCalcRS.markName}</div>
<div style="padding-left: 20px">Наименование модели: ${autoCalcResponse.autoCalcRS.modelName}</div>
<div style="padding-left: 20px">ID префикса коммерческих ТС: ${autoCalcResponse.autoCalcRS.prefixComTsId}</div>
<div style="padding-left: 20px">Наименование префикса коммерческих ТС: ${autoCalcResponse.autoCalcRS.prefixComTsName}</div>
<div style="padding-left: 20px">ID типа коммерческих ТС: ${autoCalcResponse.autoCalcRS.typeComTsId}</div>
<div style="padding-left: 20px">Наименование типа коммерческих ТС: ${autoCalcResponse.autoCalcRS.typeComTsName}</div>
<div style="padding-left: 20px">Категория транспортного средства: ${autoCalcResponse.autoCalcRS.category}</div>
<div style="padding-left: 20px">Ввод марки и модели не из справочника: ${autoCalcResponse.autoCalcRS.anotherMm}</div>
<div style="padding-left: 20px">Наименование марки ТС (ручной ввод): ${autoCalcResponse.autoCalcRS.anotherMarkName}</div>
<div style="padding-left: 20px">Наименование модели (ручной ввод): ${autoCalcResponse.autoCalcRS.anotherModelName}</div>
<div style="padding-left: 20px">Изготовитель: ${autoCalcResponse.autoCalcRS.manufacturer}</div>
<div style="padding-left: 35px">Валюта рассчитанной премии: ${autoCalcResponse.autoCalcRS.totalSumm.currency}</div>
<div style="padding-left: 35px">Рассчитанная премия: ${autoCalcResponse.autoCalcRS.totalSumm.sum}</div>
<c:forEach var="elem" items="${autoCalcResponse.autoCalcRS.risks}">
    <tr>
        <th><div style="padding-left: 35px">ID риска: ${elem.riskId}</div></th>
        <th><div style="padding-left: 35px">Наименование риска: ${elem.riskName}</div></th>
        <th><div style="padding-left: 35px">Банк обязателен: ${elem.bankRequired}</div></th>
        <th><div style="padding-left: 35px">Риск обязателен: ${elem.codeRequired}</div></th>
        <th><div style="padding-left: 50px">Валюта страховой суммы по риску: ${elem.insuredSumm.currency}</div></th>
        <th><div style="padding-left: 50px">Страховая сумма по риску: ${elem.insuredSumm.sum}</div></th>
        <th><div style="padding-left: 50px">Валюта рассчитанной премии по риску: ${elem.insuredPremium.currency}</div></th>
        <th><div style="padding-left: 50px">Рассчитанная премия по риску: ${elem.insuredPremium.sum}</div></th>
    </tr>
</c:forEach>
<c:forEach var="elem" items="${autoCalcResponse.autoCalcRS.options}">
    <tr>
        <th><div style="padding-left: 35px">ID опции: ${elem.optionId}</div></th>
        <th><div style="padding-left: 35px">Наименование опции: ${elem.optionName}</div></th>
        <th><div style="padding-left: 35px">ID риска: ${elem.riskId}</div></th>
        <th><div style="padding-left: 35px">ID группы опций: ${elem.optionGroupId}</div></th>
        <th><div style="padding-left: 35px">Обязательность группы опций: ${elem.groupOptionRequired}</div></th>
        <th><div style="padding-left: 35px">Исключительность группы опций: ${elem.groupOptionEx}</div></th>
        <th><div style="padding-left: 35px">Номер опции: ${elem.optionNumber}</div></th>
        <th><div style="padding-left: 35px">Вариант ограничение пробега для продукта КиберКАСКО: ${elem.valueOption}</div></th>
    </tr>
</c:forEach>
<div style="padding-left: 35px">Размер КВ агента, использованный для расчета: ${autoCalcResponse.autoCalcRS.insurance.kvSize}</div>
<div style="padding-left: 35px">Максимальный размер КВ по договору агента: ${autoCalcResponse.autoCalcRS.insurance.kvSizeMax}</div>
<div style="padding-left: 35px">Период страхования: ${autoCalcResponse.autoCalcRS.insurance.term_insurance}</div>
<div style="padding-left: 20px">Индекс: ${autoCalcResponse.autoCalcRS.factor}</div>
<div style="padding-left: 20px">Измененные объекты: ${autoCalcResponse.autoCalcRS.changedConditions}</div>
<div style="padding-left: 20px">Id экспресс-расчета: ${autoCalcResponse.autoCalcRS.expressQuotationId}</div>
<div style="padding-left: 20px">URL экспресс-расчета: ${autoCalcResponse.autoCalcRS.expressQuotationUrl}</div>
<div style="padding-left: 20px">ID калькуляции: ${autoCalcResponse.autoCalcRS.calculationId}</div>
<br/>
${autoCalcRs}
</body>
</html>