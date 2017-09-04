<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 31/08/17
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Belajar Spring Framework</title>
</head>
<body>
${message}

<c:if test="${not empty nama}" var="isValid">
    <c:out value="Halo Nama saya ${nama}"/>
</c:if>
</body>
</html>
