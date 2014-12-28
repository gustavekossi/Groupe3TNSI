package entites;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produit
 *
 */
@Entity

public class Produit implements Serializable {

	   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private String designation;
	private String description;
	private double prix;
	private boolean selected;
	private String photo;
	private int quantite;
	private Categorie categorie;
	@OneToMany(mappedBy="produit")
	private Collection<Ingredient> ingredients;
	@ManyToOne
	@JoinColumn(name="idMenu")
	private Menu menu;
	private static final long serialVersionUID = 1L;

	public Produit() {
		super();
	}   
	
	public Produit(String designation, String description, double prix,
			boolean selected, String photo, int quantite) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.selected = selected;
		this.photo = photo;
		this.quantite = quantite;
	}
	
	public Long getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}   
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}   
	public boolean getSelected() {
		return this.selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}   
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}   
	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}   
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation="
				+ designation + ", description=" + description + ", prix="
				+ prix + ", selected=" + selected + ", photo=" + photo
				+ ", quantite=" + quantite + ", categorie=" + categorie + "]";
	}
}
