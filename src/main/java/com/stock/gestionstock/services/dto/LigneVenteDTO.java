package com.stock.gestionstock.services.dto;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.entity.Vente;

public class LigneVenteDTO {

	private Long idLigneVente;

	private Article article;

	private Vente vente;

	public LigneVenteDTO() {
	}

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

}
