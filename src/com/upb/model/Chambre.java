package com.upb.model;
// Generated 3 f�vr. 2023, 01:03:37 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Chambre generated by hbm2java
 */
@Entity
@Table(name = "chambre", catalog = "hotel")
public class Chambre implements java.io.Serializable {

	private int idChambre;
	private Float prix;

	public Chambre() {
	}

	public Chambre(int idChambre) {
		this.idChambre = idChambre;
	}

	public Chambre(int idChambre, Float prix) {
		this.idChambre = idChambre;
		this.prix = prix;
	}

	@Id

	@Column(name = "ID_CHAMBRE", unique = true, nullable = false)
	public int getIdChambre() {
		return this.idChambre;
	}

	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}

	@Column(name = "PRIX", precision = 12, scale = 0)
	public Float getPrix() {
		return this.prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

}
