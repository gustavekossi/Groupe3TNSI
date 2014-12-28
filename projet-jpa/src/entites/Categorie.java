package entites;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Categorie
 *
 */
@Entity

public class Categorie implements Serializable {

	   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategorie;
	@NotEmpty
	@Size(min=4,max=20)
	private String nomCategorie;
	@Size(min=8)
	private String description;
	@Lob
	private byte[] photo;
	private String nomPhoto;
	@OneToMany(mappedBy="categorie")
	private Collection<Produit> produits;
	private static final long serialVersionUID = 1L;
	
	public Categorie() {
		super();
	}   

	public Categorie(String nomCategorie, String description, byte[] photo,
			String nomPhoto) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
	}
	
	public Categorie(String nomCategorie, String description, String nomPhoto) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.nomPhoto = nomPhoto;
	}
	




	public Long getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}   
	public String getNomCategorie() {
		return this.nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   

	/**
	 * @return the photo
	 */
	public byte[] getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}


	/**
	 * @return the produits
	 */
	public Collection<Produit> getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	/**
	 * @return the nomPhoto
	 */
	public String getNomPhoto() {
		return nomPhoto;
	}

	/**
	 * @param nomPhoto the nomPhoto to set
	 */
	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}   

    
}
