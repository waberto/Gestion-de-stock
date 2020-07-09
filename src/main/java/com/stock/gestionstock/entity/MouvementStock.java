package com.stock.gestionstock.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mouvementStock")
public class MouvementStock implements Serializable {

	private static final int ENTREE = 1;

	private static final int SORTIE = 2;

	@Id
	@GeneratedValue
	private Long idMouvementStock;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMouvementStock;

	private BigDecimal quantite;

	private int typeMouvementStock;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	public Long getIdMouvementStock() {
		return idMouvementStock;
	}

	public void setIdMouvementStock(Long id) {
		this.idMouvementStock = id;
	}

	public Date getDateMouvementStock() {
		return dateMouvementStock;
	}

	public void setDateMouvementStock(Date dateMouvementStock) {
		this.dateMouvementStock = dateMouvementStock;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMouvementStock() {
		return typeMouvementStock;
	}

	public void setTypeMouvementStock(int typeMouvementStock) {
		this.typeMouvementStock = typeMouvementStock;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
