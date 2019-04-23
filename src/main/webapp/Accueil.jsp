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

    
    
    <table style="width:80%" align="center">
    	<c:set var="i" value="0" scope="page"/>
    	<tr>
        <c:forEach items ="${boulangerie.produits}" var="p">
			<th>
				<img src=${p.img}/>
                <p>${p.nom} : ${p.valeur} euros</p>
               	<form method="post" action="/Boulanger/commandes-ajouter">
               		<input type = "hidden" name='produit' value='${p.nom}'>
               		<input type='submit' value='commander'>
               	</form>                
            </th>
            <c:set var="i" value="${i + 1}" scope="page"/>
            <c:if test = "${i >3 }">
         		</tr><tr>
      		</c:if>
        </c:forEach> 
        </tr>
    
    
    
</div>


<script type="text/javascript" src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>

</body>
</html>