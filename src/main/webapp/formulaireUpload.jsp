<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Envoi de fichier</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/inc/form.css"/>" />
</head>
<body>



	<!-- debut formulaire d'annonce -->


	<form action="<c:url value="Upload" />" method="post"
		enctype="multipart/form-data">
		<fieldset>

			<div class="form-group">
				<label for="exampleFormControlSelect1">Catégorie</label> <select
					class="form-control" id="exampleFormControlSelect1"
					name="categorie">
					<option>Instruments de musique</option>
					<option>Multimédias</option>

				</select>
			</div>



			<div class="mb-3">
				<label for="validationTextarea">Titre de l'annonce</label>
				<textarea class="form-control is-invalid" id="validationTextarea"
					placeholder="Required example textarea" name="titre" required></textarea>
				<div class="invalid-feedback">Veuillez entrez le titre de
					l'annonce.</div>
			</div>

			<div class="mb-3">
				<label for="validationTextarea">Description</label>
				<textarea class="form-control is-invalid" id="validationTextarea"
					placeholder="Required example textarea" name="description" required></textarea>
				<div class="invalid-feedback">Veuillez entrez la description
					de l'annonce.</div>
			</div>

			<div class="mb-3">
				<div>
					<label for="validationTooltip01">Prix</label> <input type="number"
						class="form-control" id="validationTooltip01" placeholder="€"
						name="prix" required>
					<div class="invalid-feedback">Veuillez entrez un prix.</div>
				</div>








				<legend>Envoi de fichier</legend>


				<label for="fichier">Emplacement du fichier <span
					class="requis">*</span></label> <input type="file" id="fichier"
					name="fichier" value="<c:out value="${fichier.nom}"/>" /> <span
					class="erreur">${form.erreurs['fichier']}</span> <br /> <input
					type="submit" value="Envoyer" class="sansLabel" /> <br />

				<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
		</fieldset>
	</form>


	<!-- fin formulaire d'annonce -->

	<form class="was-validated" action="ConstructeurAnnonce" method="post"
		enctype="multipart/form-data">






		<!-- <button type="submit" class="btn btn-primary">Créer l'annonce</button> -->



	</form>






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