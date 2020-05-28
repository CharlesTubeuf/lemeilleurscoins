<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>Connexion</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>

<body>

	<!--debut navbar  -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="Index">LeMeilleurCoin</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">


				<c:if test="${empty sessionScope.compte}">
					<li class="nav-item active"><a class="nav-link  "
						href="./connexion.jsp">Se connecter<span class="sr-only">(current)</span></a>
					</li>
				</c:if>

				<c:if test="${!empty sessionScope.compte}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Bienvenue <c:out
								value="${compte.pseudo}" />
					</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="Compte">Accéder à mon compte</a>  <a
								class="dropdown-item" href="./formulaireUpload.jsp">Déposer
								une annonce</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="DestroySession">Se déconnecter</a>
						</div></li>
				</c:if>



			</ul>
			<a class="navbar-brand" href="#"> <img src="img/payment.png"
				alt="..." style="width: 5rem;">
			</a>

		</div>
	</nav>

	<!--fin navbar  -->





	<!-- couleur du background -->
	<div class="p-3 mb-2 bg-dark text-white">







		<div>

			<!--  debut connexion -->
			<div class="container">
			<h2 class="text-center">Connectez vous</h2>
			<i> <c:if test="${creer==true}"><p class="text-success"> Le compte à bien été creer, veuillez vous connecter...</p> </c:if>
				<c:if test="${connect==false}"><p class="text-danger">  OUPS... le MDP ou le pseudo est incorrect, veuillez vous inscrire...</p> </c:if>
			</i>

			<form action="Connexion" method="post" style='weight:70%;'>
				<div class="form-group">
					<label for="pseudo">Pseudo</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" name="pseudo" required>

				</div>
				<div class="form-group">
					<label for="mdp">Password</label> <input type="password"
						class="form-control" id="exampleInputPassword1" name="mdp"
						required>
				</div>

				<button type="submit" class="btn btn-primary p-3 mb-2">Connexion</button>


			</form>
			</div>
			<div class="text-center">
				<a class="navbar-brand " href="./inscription.jsp">Inscrivez
					vous!</a>
			</div>
			<!-- fin connexion -->



		</div>

		<div class="border-top">
	<!-- debut footer  -->
	
	<footer>
		<div class="container-fluid p-3 mb-2 bg-dark text-white d-flex justify-content-center">
			<div class="container">
				<div class="row">
					<div class="col-md-7">
						<div class="row py-0">
						
							
						</div>
					</div>
					<div class="container p-3 mb-2 ">
		<div class="block " >
					<div class="list-unstyled list-inline text-center">
						<div class="d-inline-block">
							<div class="bg-circle-outline d-inline-block"
								style="background-color: #3b5998">
								<a href="https://www.facebook.com/"><i
									class="fa fa-2x fa-fw fa-facebook text-white"></i> </a>
							</div>
							<div class="bg-circle-outline d-inline-block"
								style="background-color: #4099FF">
								<a href="https://twitter.com/"> <i
									class="fa fa-2x fa-fw fa-twitter text-white"></i></a>
							</div>

							<div class="bg-circle-outline d-inline-block"
								style="background-color: #0077B5">
								<a href="https://www.linkedin.com/company/"> <i
									class="fa fa-2x fa-fw fa-linkedin text-white"></i></a>
							</div>
							<div class="bg-circle-outline d-inline-block"
								style="background-color: #d34836">
								<a href="https://www.google.com/"> <i
									class="fa fa-2x fa-fw fa-google text-white"></i></a>
							</div>
							</div>
					</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
		<!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2020 Copyright:
    <a href="https://mdbootstrap.com/"> LeMeilleurCoin.com</a>
  </div>
  <!-- Copyright -->
	</footer>
	<!--/.footer-->

	<!--/.footer-bottom-->
	<!-- fin footer -->

</div> 

		<link
			href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
			rel="stylesheet" id="bootstrap-css">
		<script
			src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
		<!------ Include the above in your HEAD tag ---------->

		<link
			href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
			rel="stylesheet">

		<link
			href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
			rel="stylesheet">

		<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
			integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
			integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
			integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
			crossorigin="anonymous"></script>

		</script>
</body>

</html>