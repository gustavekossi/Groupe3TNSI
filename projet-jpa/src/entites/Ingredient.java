package entites;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ingredient
 *
 */
@Entity

public class Ingredient implements Serializable {

	   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idIngredient;
	private String nom;
	@ManyToOne
	@JoinColumn(name="idProduit")
	private Produit produit;
	private static final long serialVersionUID = 1L;

	public Ingredient() {
		super();
	}   
	public Long getIdIngredient() {
		return this.idIngredient;
	}

	public void setIdIngredient(Long idIngredient) {
		this.idIngredient = idIngredient;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
   
}


