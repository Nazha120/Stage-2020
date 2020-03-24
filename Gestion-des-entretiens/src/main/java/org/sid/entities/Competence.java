package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Competence implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String libelle;
	
	@OneToMany(mappedBy = "competence")
	private Collection<Candidat> candidats;
	
	
	public Competence() {
	}
	public Competence(Long id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void SetLibelle(String libelle) {
		this.libelle = libelle;
	}
}
