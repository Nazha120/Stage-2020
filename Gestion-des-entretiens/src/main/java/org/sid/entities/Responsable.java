package org.sid.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("responsable")
public class Responsable extends Personne{
	private String login;
	private String password;
	@OneToMany(mappedBy = "responsable")
	private Collection<Entretien> entretiens;
	@OneToMany(mappedBy = "responsable")
	private Collection<Communication> communications;
	
	public Responsable() {
		super();
	}
	public Responsable(Long id,String nom, String prenom, String telephone, String ville, String age, String login, String password) {
		super(id,nom, prenom, telephone, ville, age);
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
