package com.stock.gestionstock.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "article")
public class Article implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTva;
	private BigDecimal prixUnitaireTTC;
	private String photo;

	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Category category;
	
	public Article() {
	}
		

	public Article(int id, String name, String designation, BigDecimal prixUnitaireHT,
			BigDecimal tauxTva, BigDecimal prixUnitaireTTC, String photo, Category category) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.prixUnitaireHT = prixUnitaireHT;
		this.tauxTva = tauxTva;
		this.prixUnitaireTTC = prixUnitaireTTC;
		this.photo = photo;
		this.category = category;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameArticle() {
		return name;
	}

	public void setNameArticle(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
