package ecommerce_gestionProduitImpl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ecommerce_gestionProduitItf.GestionProduitItf;
import entites.Categorie;
import entites.Produit;

@Stateless
@Remote(GestionProduitItf.class)
public class GestionProduitImpl implements GestionProduitItf {


	@PersistenceContext(unitName = "Persist")
	EntityManager em;
	@Override
	public String ajouterProduit(String designation, String description,
			double prix, boolean selected, String photo, int quantite) {
		String ret = "Ajouter";
		//Categorie(String nomCategorie, String description, byte[] photo,String nomPhoto)
//		Categorie c = new Categorie("c1", "d1", "j");
		Categorie c = new Categorie("panini", "ensemble des panini", "pas de photo");
		//Produit(String designation, String description, double prix,boolean selected, String photo, int quantite)
		Produit p = new Produit(designation, description, prix, selected, photo, quantite);
		em.persist(c);
		em.persist(p);

		return ret;
	}

	@Override
	public String afficher() {
		Query ret = em.createQuery("select p from Produit p");
		List<Produit> list = ret.getResultList();
		
		return list.toString();
	}

}
