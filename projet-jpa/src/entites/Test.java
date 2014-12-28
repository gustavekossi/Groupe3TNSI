package entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Test {
	@Id @GeneratedValue
	private int id;
	private String nom;
	private String prenom;
}
