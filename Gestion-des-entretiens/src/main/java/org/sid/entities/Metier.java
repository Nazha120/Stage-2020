package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Metier implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String IT;
	
	@OneToMany(mappedBy = "metier")
	private Collection<Candidat> candidats;
	
	public Metier() {
	}
	public Metier(Long id, String IT) {
		this.id = id;
		this.IT = IT;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIT() {
		return IT;
	}
	public void setIT(String IT) {
		this.IT = IT;
	}	
}
