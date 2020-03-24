package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Etat implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String etat;
	@OneToMany(mappedBy = "etat")
	private Collection<Entretien> entretiens;
	
	public Etat() {
	}
	public Etat(Long id, String etat) {
		this.id = id;
		this.etat = etat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	

}
