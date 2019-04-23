package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Boulangerie;
import model.Produit;


public class RecetteServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Boulangerie boulangerie = (Boulangerie)this.getServletConfig().getServletContext().getAttribute("boulangerie"); 
		if(boulangerie == null) {
			req.getRequestDispatcher("/accueil").forward(req,resp);
		}
	
		req.setAttribute("commandes", boulangerie.getCommandes());
		req.setAttribute("totalRecettes", boulangerie.calculerRecette());
		req.getRequestDispatcher("Recette.jsp").forward(req,resp);
		
	}
	
}
