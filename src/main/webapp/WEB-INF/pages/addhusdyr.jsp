<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title></title>
</head>
<body>
Legg til husdyr:
<form:form modelAttribute="husdyr">
    Navn:
    <form:input path="navn" /><br />
    Art:
    <form:input path="art" /><br />
    Koble til person:

    <form:select path="p_id">
        <c:forEach items="${personer}" var="p">
            <form:option value="${p.id}">${p.fornavn}, ${p.etternavn}</form:option>
        </c:forEach>
    </form:select>

    <br />
    <input type="submit" value="Lagre husdyr" />
</form:form>
</body>
</html>
