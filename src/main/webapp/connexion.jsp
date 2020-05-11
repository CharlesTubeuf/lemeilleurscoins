<%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>Connexion</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>

<body>

<!--debut navbar  -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="./index.jsp">LeMeilleurCoin</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="./connexion.jsp">Se connecter<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Mes recherches</a>
      </li>
      
     <li class="nav-item">
        <a class="nav-link" href="#">Favoris</a>
      </li>
      
   <li class="nav-item">
        <a class="nav-link" href="#">Messages</a>
      </li>
    </ul>
  <a class="navbar-brand" href="#"> <img src="img/payment.png"  alt="..." style="width: 5rem;" > </a>
   
  </div>
</nav>
<!--fin navbar  -->

<h2 class="text-center">Connectez vous</h2>
<br/>
<!-- debut connexion -->
<c:if test="${creer==true}"> Le compte à bien été creer, veuillez vous connecter... </c:if>
<br/>
<c:if test="${connect==false}"> OUPS... le MDP ou le pseudo est incorrect, veuillez vous connecter... </c:if>
<form action="Connexion" method="post">
  <div class="form-group">
    <label for="pseudo" >Pseudo</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="pseudo" required>
   
  </div>
  <div class="form-group">
    <label for="mdp">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="mdp" required>
  </div>
  
  <button type="submit" class="btn btn-primary">Connexion</button>
</form>
<!-- fin connexion -->


 <a  href="./inscription.jsp" >S'inscrire!</a>





<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" 
integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous">
</script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" 
integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
</script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" 
integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous">
</script>
</body>

</html>