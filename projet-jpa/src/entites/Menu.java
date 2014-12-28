package entites;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Menu
 *
 */
@Entity

public class Menu implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idMenu;
	private String nom;
	@OneToMany(mappedBy="menu")
	private Collection<Produit> produits;
	private static final long serialVersionUID = 1L;

	public Menu() {
		super();
	}   
	public long getIdMenu() {
		return this.idMenu;
	}

	public void setIdMenu(long idMenu) {
		this.idMenu = idMenu;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public Collection getProduits() {
		return this.produits;
	}

	public void setProduits(Collection produits) {
		this.produits = produits;
	}
   
}
