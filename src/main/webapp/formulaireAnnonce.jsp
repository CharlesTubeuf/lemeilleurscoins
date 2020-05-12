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
<h3>Veuillez remplir les informations concernants votre annonce</h3>

<form>

<!-- menu déroulant permettant de choisir la catégorie -->

<div class="form-group">
    <label for="exampleFormControlSelect1">Catégorie</label>
    <select class="form-control" id="exampleFormControlSelect1">
      <option>jeux</option>
      <option>trucs bizarres</option>
      <option>musique</option>
      <option>voitures</option>
      <option>cartes pokémon</option>
    </select>
  </div>
  
<!-- titre de l'annonce; -->

<div class="form-group">
    <label for="exampleFormControlTextarea1">Titre de l'annonce</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="1"></textarea>
</div>

	 <!-- prix de l'objet ; -->
<div class="form-group">
    <label for="exampleInputEmail1">Prix</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">	
</div>
	
	 <!-- description de l'objet ; -->
	 
<div class="form-group">
    <label for="exampleFormControlTextarea1">Description</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
</div>
	 
	<!-- ajouter une ou plusieurs photos de l'objet; -->

  <div class="form-group">
    <label for="exampleFormControlFile1">Mettre une photo</label>
    <input type="file" class="form-control-file" id="exampleFormControlFile1">
  </div>
</form>



<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>