<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <style>
       /* Set the size of the div element that contains the map */
      #map {
        height: 400px;  /* The height is 400 pixels */
        width: 100%;  /* The width is the width of the web page */
        background-color: grey;
       }
    </style>
  </head>
  <body>
    <h3>Localisation de l'annonce</h3>
    <!--The div element for the map -->
    <div id="map"></div>
    <script>
// Initialize and add the map
function initMap() {
	
  // The location of la ville corespondant à l'annonce
  
            
			
	var loca = <c:out value="${annonceSelect.compte.ville}"/>
			
  var paris = {lat: 48.866666, lng: 2.33333};
  // The map, centered at Uluru
  var map = new google.maps.Map(
      document.getElementById('map'), {zoom: 10, center: paris});
  // The marker, positioned at Uluru
  var marker = new google.maps.Marker({position: paris, map: map});
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
  </body>
</html>