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
<div> faire apparetre les infos du compte et permettre de les modifier... 
pouvoir ajouter une photo (optionnel), pouvoir ajouter un numéro de téléphone,  ect... </div>
<!--  faire un bouton déposer une annonce et envoyer vers la page déposer une annonce -->
<a href="/formulaireAnnonce.jsp">Déposer une annonce</a>
</body>
</html>