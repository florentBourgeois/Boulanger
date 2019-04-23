package model;

public class Produit {
	
	private String nom;
	private int valeur;
	private String img;
	
	
	public Produit(String nom, int valeur, String img) {
		super();
		this.nom = nom;
		this.valeur = valeur;
		this.img = img;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return nom + " vendu à " + valeur + " euro";
	}
	
	

	
}
