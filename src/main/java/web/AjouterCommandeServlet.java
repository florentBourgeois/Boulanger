package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Boulangerie;
import model.Produit;


@WebServlet("/accueil" )
public class AjouterCommandeServlet extends HttpServlet {
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Boulangerie boulangerie = (Boulangerie)this.getServletConfig().getServletContext().getAttribute("boulangerie"); 
		System.out.println("boulangerie : " + boulangerie);
		
		if(boulangerie == null) {
			req.getRequestDispatcher("/accueil").forward(req,resp);
		}
		else {
		
			String nomProduit = req.getParameter("produit");
	        String message = "Produit inexistant, la commande reste identique";
	        for (Produit produit : boulangerie.getProduits()) {
	        	System.out.println(produit.getNom() + " et " + nomProduit);
	        	
				if(produit.getNom().equals(nomProduit)){
					message = "Produit " + produit.getNom() + " ajouté";
					boulangerie.getCommandeEnCour().ajouterProduit(produit);
				}
			}
	        
	        req.setAttribute("message", message);
	        req.setAttribute("commande",boulangerie.getCommandeEnCour());
			req.getRequestDispatcher("Panier.jsp").forward(req,resp);


		}
		 			
	}
	
	
}
