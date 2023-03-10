package com.upb.model;
// Generated 3 f�vr. 2023, 01:03:37 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name = "client", catalog = "hotel")
public class Client implements java.io.Serializable {

	private int idClient;
	private String nom;
	private String prenom;
	private String email;
	private int contact;

	public Client() {
	}

	public Client(int idClient, String nom, String email, int contact) {
		this.idClient = idClient;
		this.nom = nom;
		this.email = email;
		this.contact = contact;
	}

	public Client(int idClient, String nom, String prenom, String email, int contact) {
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.contact = contact;
	}

	@Id

	@Column(name = "ID_CLIENT", unique = true, nullable = false)
	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	@Column(name = "NOM", nullable = false, length = 30)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "PRENOM", length = 30)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "EMAIL", nullable = false, length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "CONTACT", nullable = false)
	public int getContact() {
		return this.contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

}
