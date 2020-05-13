<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>déposer une annonce</title>
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
	
<h3>Veuillez remplir les informations concernants votre annonce</h3>

<form action="ConstructeurAnnonce" method="get">     <!-- formulaire de dépot d'annonce -->

<!-- menu déroulant permettant de choisir la catégorie -->

<div class="form-group">
    <label for="categorie">Catégorie</label>
    <select class="form-control" id="categorie" name="categorie" required>
      <option>Instrument de musique</option>
      <option>Multimédia</option>
    </select>
  </div>
  
<!-- titre de l'annonce; -->

<div class="form-group">
    <label for="titre">Titre de l'annonce</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" name="titre" rows="1"></textarea>
</div>

	 <!-- prix de l'objet ; -->
<div class="form-group">
    <label for="prix">Prix</label>
    <input type="number" placeholder="€" class="form-control" id="prix" name="prix" aria-describedby="Choisissez le prix qui vous parait le plus juste">	
</div>
	
	 <!-- description de l'objet ; -->
	 
<div class="form-group">
    <label for="description">Description</label>
    <textarea class="form-control" placeholder="Veuillez décrire brièvement votre produit..." id="description" name="description" rows="3"></textarea>
</div>
	 
	<!-- ajouter une ou plusieurs photos de l'objet; -->

  <div class="form-group">
    <label for="photos">Mettre une photo</label>
    <input type="file" class="form-control-file" id="photos" name="photos">
  </div>
</form>



<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>