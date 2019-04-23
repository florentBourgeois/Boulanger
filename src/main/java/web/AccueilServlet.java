package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Boulangerie;
import model.Produit;


@WebServlet("/accueil" )
public class AccueilServlet extends HttpServlet {
	
	private Boulangerie boulangerie;
	
	@Override
	public void init() throws ServletException {
		super.init();
		boulangerie = new Boulangerie();
		boulangerie.ajouterProduit(new Produit("pain", 2, "https://upload.wikimedia.org/wikipedia/commons/1/1f/FD_1.jpg"));
		boulangerie.ajouterProduit(new Produit("baguette", 1, "https://upload.wikimedia.org/wikipedia/commons/9/97/Nl-baguettes2.jpg"));
		boulangerie.ajouterProduit(new Produit("bredala", 3, "https://upload.wikimedia.org/wikipedia/commons/d/db/Fr_Alsace_Plaque_bredele_2.jpg"));
		
		
	    this.getServletConfig().getServletContext().setAttribute("boulangerie", boulangerie); 

	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("Accueil.jsp").forward(req,resp);
		
	}
	

}
