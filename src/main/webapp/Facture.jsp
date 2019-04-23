<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Boulangerie</title>

    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0-2/css/bootstrap.min.css" />

</head>
<body>


<div class="container">

    <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand" href="/accueil">Accueil</a>
        <a class="navbar-brand" href="/commandes-ajouter">Panier</a>
        <a class="navbar-brand" href="/recette">Recettes</a>
    </nav>

    <h1>Boulangerie ${boulangerie.nom}</h1>


    <h1>Facture</h1>

    
    <ul>
        <c:forEach items ="${commande.produits}" var="p">
            <li>
                    <p>${p.nom} : ${p.valeur}</p>
            </li>
        </c:forEach> 
    </ul>

    <b>Total : ${total}</b>


</div>


<script type="text/javascript" src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>

</body>
</html>