package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Boulangerie;
import model.Commande;
import model.Produit;


public class ValiderCommandeServlet extends HttpServlet {
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Boulangerie boulangerie = (Boulangerie)this.getServletConfig().getServletContext().getAttribute("boulangerie"); 
		if(boulangerie == null) {
			req.getRequestDispatcher("/accueil").forward(req,resp);
		}
		else {
			Commande commande = boulangerie.getCommandeEnCour();
			boulangerie.validerCommandeEncour();
			
	        
	        req.setAttribute("commande",commande);
	        req.setAttribute("total",commande.calculerPrix());
			req.getRequestDispatcher("Facture.jsp").forward(req,resp);

		}
		 			
	}
	
	
}
