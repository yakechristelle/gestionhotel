package com.upb.model;
// Generated 3 f�vr. 2023, 01:03:37 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Formule generated by hbm2java
 */
@Entity
@Table(name = "formule", catalog = "hotel")
public class Formule implements java.io.Serializable {

	private Integer idFormule;
	private String famille;
	private String solo;

	public Formule() {
	}

	public Formule(String famille, String solo) {
		this.famille = famille;
		this.solo = solo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_FORMULE", unique = true, nullable = false)
	public Integer getIdFormule() {
		return this.idFormule;
	}

	public void setIdFormule(Integer idFormule) {
		this.idFormule = idFormule;
	}

	@Column(name = "FAMILLE", length = 10)
	public String getFamille() {
		return this.famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	@Column(name = "SOLO", length = 10)
	public String getSolo() {
		return this.solo;
	}

	public void setSolo(String solo) {
		this.solo = solo;
	}

}
