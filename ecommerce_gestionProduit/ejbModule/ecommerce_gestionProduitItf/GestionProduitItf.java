package ecommerce_gestionProduitItf;

public interface GestionProduitItf {
	public String ajouterProduit(String designation, String description, double prix,boolean selected, String photo, int quantite);
	public String afficher();
}
