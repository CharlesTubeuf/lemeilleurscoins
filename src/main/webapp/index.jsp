

<!-- <body>
<h1> Bienvenue sur notre site !</h1>

<a  href="./connexion.jsp">Connexion</a>
<br>
<a href="./inscription.jsp">Inscription</a> -->


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Page d'acceuil</title>
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

<h5 class="text-center p-3 mb-2 bg-primary text-white">Trouvez la bonne affaire parmi les millions de petites annonces LeMeilleurCoin</h5>


<!--debut de la barre de recherche -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">


  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Cat�gories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Multim�dias</a>
          <a class="dropdown-item" href="#">Instruments de musique</a>
         
        </div>
     <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Rechercher" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Que recherchez-vous?</button>
    </form>
    
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Localisation" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Saisissez une localisation</button>
    </form>
    </ul>
    
  </div>
</nav>
<!--fin de la barre de recherche  -->




<!-- debut du carousel -->

<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/dj.jpg" class="d-block w-100" alt="..." >
      <div class="carousel-caption d-none d-md-block">
        <h5>First slide label</h5>
        <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img/collection.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Second slide label</h5>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img/computer.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Third slide label</h5>
        <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
      </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<!-- fin du carousel -->

<h5 class="text-center p-3 mb-2 bg-primary text-white">Top des ventes</h5>

<!-- debut top cat�gories -->


<div class="row row-cols-1 row-cols-md-3">
  <div class="col mb-4">
    <div class="card h-100">
      <img src="img/electriqueguitare.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Guitare</h5> 
        
      </div>
    </div>
  </div>
  <div class="col mb-4">
    <div class="card h-100">
      <img src="img/viny.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Vinyles</h5>
 
      </div>
    </div>
  </div>
  <div class="col mb-4">
    <div class="card h-100">
      <img src="img/carteson.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Carte son</h5>
       
      </div>
    </div>
  </div>
 
</div>
<!-- fin top cat�gories -->






<!-- debut footer  -->


<!-- fin footer -->



<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>


