package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Entretien implements Serializable {
	@Id@GeneratedValue
	private Long id;
	private Date date;
	private String heure;
	private String lieu;
	@ManyToOne
    private Candidat candidat;
	@ManyToOne
	private Responsable responsable;
	@ManyToOne
	private Etat etat;
	
	public Entretien() {
	}

	public Entretien(Long id, Date date, String heure, String lieu) {
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.lieu = lieu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

}
