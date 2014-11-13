<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
</head>
<body>
Her er alle personene med sine husdyr:
<ul>
<c:forEach items="${personer}" var="person">
    <li>${person.fornavn}, ${person.etternavn}
        <ul>
            <c:forEach items="${person.husdyr}" var="husdyr">
                  <li>${husdyr.navn}</li>
            </c:forEach>
        </ul>
    </li>
</c:forEach>
</ul>
</body>
</html>
