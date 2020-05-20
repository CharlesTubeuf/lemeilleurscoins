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
<title>MonCompte</title>
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
					href="#"><div>
							Bienvenue
							<c:out value="${sessionScope.pseudo}" />
						</div>
						<span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link"
					href="./formulaireUpload.jsp"> Déposer une annonce</a></li>


				
			</ul>
			<a class="navbar-brand" href="#"> <img src="img/payment.png"
				alt="..." style="width: 5rem;">
			</a>

		</div>
	</nav>
	<!--fin navbar  -->
	
	
		<!-- debut information sur l'utilisateur -->
		
		<div class=" bg-secondary text-white text-center">
	
							Bienvenue
							<c:out value="${compte.pseudo}" />
							!
							<br>
							Email:
							<c:out value="${compte.mail}" />
							<br>
							Numéro de télephone: 
							<c:out value="${compte.numTel}" />
							<br>
							Ville: 
							<c:out value="${compte.ville}" />
						</div>
		
		<!--fin information sur l'utilisateur  -->



		
		

	
	
	
	
	
	
	

		
	
		







	

	<h5 class="text-center p-3 mb-2 bg-primary text-white">Vos annonces</h5>
	
<!-- mise en place d'un nombre de card égale au nombre d'annonce dans la liste d'annonce du compte. -->

 <c:forEach items="${listAnnonces}" var="Annonce">
 
 <div class="col-sm-3">
 
	<div class="card" style="width: 18rem;">	
  <img src="${Annonce.nomImage}" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title"><c:out value="${Annonce.titre}"/></h5>
    <p class="card-text">Description : <c:out value="${Annonce.description}"/></p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">Prix : <c:out value="${Annonce.prix}"/></li>    
  </ul>
  <div class="card-body">
    <a href="#" class="card-link">supprimé l'annonce</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>
</div>


</c:forEach>





	<!-- debut footer  -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<footer>
     <div class="container-fluid p-3 mb-2 bg-dark text-white">
    <div class="container">
      <div class="row">
        <div class="col-md-7">
            <div class="row py-0">
          <div class="col-sm-1 hidden-md-down">
              <a class="bg-circle bg-info" href="#">
                <i class="fa fa-2x fa-fw fa-address-card" aria-hidden="true "></i>
              </a>
            </div>
            <div class="col-sm-11 text-white">
                <div><h4>  Contact</h4>
                    <p>   <span class="header-font"></span><span class="header-font"></span>LeMeilleurCoin.com</p>
                </div>
            </div>
            </div>
        </div>
        <div class="col-md-5">
          <div class="d-inline-block">
            <div class="bg-circle-outline d-inline-block" style="background-color:#3b5998">
              <a href="https://www.facebook.com/"><i class="fa fa-2x fa-fw fa-facebook text-white"></i>
		</a>
            </div>
            <div class="bg-circle-outline d-inline-block" style="background-color:#4099FF">
              <a href="https://twitter.com/">
                <i class="fa fa-2x fa-fw fa-twitter text-white"></i></a>
            </div>

            <div class="bg-circle-outline d-inline-block" style="background-color:#0077B5">
              <a href="https://www.linkedin.com/company/">
                <i class="fa fa-2x fa-fw fa-linkedin text-white"></i></a>
            </div>
            <div class="bg-circle-outline d-inline-block" style="background-color:#d34836">
              <a href="https://www.google.com/">
                <i class="fa fa-2x fa-fw fa-google text-white"></i></a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <p class="text-center"> Copyright © LeMeilleurCoin.com </p>
    </div>
</footer>
    <!--/.footer-->

    <!--/.footer-bottom--> 
	<!-- fin footer -->




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