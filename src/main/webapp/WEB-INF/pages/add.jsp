<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: christerhansen
  Date: 06.11.14
  Time: 09.51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Legg til person:
<form:form modelAttribute="person">
    Fornavn:
    <form:input path="fornavn" /><br />
    Etternavn:
    <form:input path="etternavn" /><br />
    <input type="submit" value="Lagre person" />
</form:form>
</body>
</html>
