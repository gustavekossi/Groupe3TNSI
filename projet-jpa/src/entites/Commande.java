package entites;

import java.io.Serializable;
import java.lang.Long;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Commande
 *
 */
@Entity

public class Commande implements Serializable {

	   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommade;
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	@OneToMany(mappedBy="commande")
	private Collection<LigneCommande> items;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	private static final long serialVersionUID = 1L;

	public Commande() {
		super();
	}   
	public Long getIdCommade() {
		return this.idCommade;
	}

	public void setIdCommade(Long idCommade) {
		this.idCommade = idCommade;
	}   
	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
   
}
