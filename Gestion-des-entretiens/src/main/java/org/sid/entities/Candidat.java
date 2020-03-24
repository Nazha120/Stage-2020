package org.sid.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("candidat")
public class Candidat extends Personne {

	private String disponibilite;
	private String experience;
	private String salaire;
    private String resume;
    private String cvtheque;
    
	@ManyToOne
	private Metier metier;
	@ManyToOne
    @JoinColumn(name = "competence_id")
	private Competence competence;
	@OneToMany(mappedBy = "candidat")
	private Collection<Entretien> entretiens;
	@OneToMany(mappedBy = "candidat")
	private Collection<Communication> communications;
	
	public Candidat() {
		super();
	}

	public Candidat(Long id, String nom, String prenom, String telephone, String ville, String age,String disponibilite, String experience, String salaire, String resume, String cvtheque,
			Metier metier, Competence competence) {
		super(id, nom, prenom, telephone, ville, age);
		this.disponibilite = disponibilite;
		this.experience = experience;
		this.salaire = salaire;
		this.resume = resume;
		this.cvtheque = cvtheque;
		this.metier = metier;
		this.competence = competence;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getCvtheque() {
		return cvtheque;
	}
	public void setCvtheque(String cvtheque) {
		this.cvtheque = cvtheque;
	}
	public Metier getMetier() {
		return metier;
	}
	public void setMetier(Metier metier) {
		this.metier = metier;
	}

	public Competence getCompetence() {
		return competence;
	}

	public void setCompetence(Competence competence) {
		this.competence = competence;
	}
}
