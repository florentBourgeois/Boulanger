package model;

import java.util.ArrayList;
import java.util.List;

public class Commande {
	
	private List<Produit> produits = new ArrayList<>();
	
	public Commande() {
	}
	
	
	
	
	public List<Produit> getProduits() {
		return produits;
	}




	public void ajouterProduit(Produit p) {
		this.produits.add(p);
	}

	public int calculerPrix() {
		int prix = 0;
		for (Produit produit : produits) {
			prix += produit.getValeur();
		}
		return prix;
	}

	@Override
	public String toString() {
		return "Commande \n\t[produits=" + produits + "\n\tPour une valeur de " + calculerPrix();
	}
	

	
	
}
