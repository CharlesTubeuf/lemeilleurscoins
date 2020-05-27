<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Annonce</title>
<!-- REGLAGES DE LA MAP LOCALISATION -->
<style>
       /* Set the size of the div element that contains the map */
      #map {
        height: 200px;  /* The height is 400 pixels */
        width: 200px;  /* The width is the width of the web page */
        background-color: grey;
       }
    </style>
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
							<a class="dropdown-item" href="Compte">Accéder à mon compte</a> <a
								class="dropdown-item" href="#">Mes annonces</a> <a
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

	<!-- début Affichage de l'annonce -->

	<div class="container">
		<div class="block" col-sm-6>

			<div class="card" style="width: 75%">
				<img src="${annonceSelect.nomImage}" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">
						<c:out value="${annonceSelect.titre}" />
					</h5>
					<p class="card-text">
						Description :
						<c:out value="${annonceSelect.description}" />
					</p>
				
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Prix : <c:out
							value="${annonceSelect.prix}" /></li>
				</ul>
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Localisation : <c:out
							value="${annonceSelect.compte.ville}" /></li>
				</ul>
				</div>
				<div class="card-body">

					<div class="card-header">
						Vendu par :
						<c:out value="${annonceSelect.compte.pseudo}" />
					</div>
					<div class="card-body">
					<h5 class="card-title">	Mail : <c:out value="${annonceSelect.compte.mail}" />
						</h5>
						<p class="card-text">
							Téléphone : 0<c:out value="${annonceSelect.compte.numTel}" />
						</p>
						
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- fin Affichage de l'annonce -->
	
	
<!-- DEBUT AFFICHAGE DE LA MAP   -->

 <h3>Localisation de l'annonce</h3>
    <!--The div element for the map -->
    <div id="map"></div>
    <script>
// Initialize and add the map
function initMap() {
	
  // The location of la ville corespondant à l'annonce
  
            
	
	
  var ville = {lat: <c:out value="${latitude}"/>, lng: <c:out value="${longitude}"/>};
  // The map, centered at Uluru
  var map = new google.maps.Map(
      document.getElementById('map'), {zoom: 10, center: ville});
  // The marker, positioned at Uluru
  var marker = new google.maps.Marker({position: ville, map: map});
}
    </script>
    <!--Load the API from the specified URL
    * The async attribute allows the browser to render the page while the API loads
    * The key parameter will contain your own API key (which is not needed for this tutorial)
    * The callback parameter executes the initMap() function
    -->
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDBlKcqseEtnMXU1lEnbs_zeIm-kxXPoPE&callback=initMap">
    </script>


<!-- FIN AFFICHAGE DE LA MAP   -->
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
</body>
</html>