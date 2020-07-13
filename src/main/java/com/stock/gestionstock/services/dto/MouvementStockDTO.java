package com.stock.gestionstock.services.dto;

import java.math.BigDecimal;
import java.util.Date;


import com.stock.gestionstock.entity.Article;

public class MouvementStockDTO {

	private Long idMouvementStock;

	private Date dateMouvementStock;

	private BigDecimal quantite;

	private int typeMouvementStock;

	private Article article;

	public MouvementStockDTO() {
	}

	public Long getIdMouvementStock() {
		return idMouvementStock;
	}

	public void setIdMouvementStock(Long idMouvementStock) {
		this.idMouvementStock = idMouvementStock;
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
