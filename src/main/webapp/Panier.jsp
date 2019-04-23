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
        <a class="navbar-brand" href="/Boulanger/accueil">Accueil</a>
        <a class="navbar-brand" href="/Boulanger/commande-encour">Panier</a>
        <a class="navbar-brand" href="/Boulanger/commande-payees">Recettes</a>
    </nav>

    <h1>Boulangerie ${boulangerie.nom}</h1>


    <p>${message}</p>


    <h1>Votre commande</h1>

    
    <ul>
        <c:forEach items ="${commande.produits}" var="p">
            <li>
                    <p>${p.nom} vendu au prix de ${p.valeur}</p>
            </li>
        </c:forEach> 
    </ul>

</div>


<script type="text/javascript" src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>

</body>
</html>