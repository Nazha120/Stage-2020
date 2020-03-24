package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Communication implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String objet;
    private Date date;
	private String heure;
    
	@ManyToOne
    private Candidat candidat;
	@ManyToOne
	private Responsable responsable;
	
	public Communication() {
	}
	public Communication(Long id, String objet, Date date, String heure) {
		this.id = id;
		this.objet = objet;
		this.date = date;
		this.heure = heure;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
    
}
