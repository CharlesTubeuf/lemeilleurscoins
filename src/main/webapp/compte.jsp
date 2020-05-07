<%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MonCompte</title>
</head>
<body>
<div> Mr <c:out value="${sessionScope.pseudo}"/> </div>
<div> BIENVENUE SUR VOTRE COMPTE BRAVO !!!!</div>
</body>
</html>