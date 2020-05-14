<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>Inscription</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>

<body>

	<!--debut navbar  -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="./index.jsp">LeMeilleurCoin</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="./connexion.jsp">Se connecter<span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Mes
						recherches</a></li>

				<li class="nav-item"><a class="nav-link" href="#">Favoris</a></li>

				<li class="nav-item"><a class="nav-link" href="#">Messages</a>
				</li>
			</ul>
			<a class="navbar-brand" href="#"> <img src="img/payment.png"
				alt="..." style="width: 5rem;">
			</a>

		</div>
	</nav>
	<!--fin navbar  -->




	<br />
	<!-- debut connexion -->

	<div>
		
				<h2 class="text-center">Inscrivez vous</h2>
				<form action="Inscription" method="get">

					<div class="form-group">
						<label for="mail">Email</label> <input type="email"
							class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" name="mail" required>

					</div>


					<div class="form-group">
						<label for="pseudo">Pseudo</label> <input type="text"
							class="form-control" id="exampleInputPseudo1"
							aria-describedby="emailHelp" name="pseudo" required>
						<i> <c:if test="${creer==false}"> Le pseudo est déjà utilisé... </c:if> </i>
					</div>
					<div class="form-group">
						<label for="mdp">Mot de passe</label> <input type="password"
							class="form-control" id="exampleInputPassword1" name="mdp"
							required>
					</div>

					<button type="submit" value="Inscription" class="btn btn-primary">Inscription</button>
				</form>
				<!--  fin inscription -->			
	</div>



	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous">
		
	</script>
</body>

</html>