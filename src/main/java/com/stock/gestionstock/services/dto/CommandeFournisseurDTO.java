package com.stock.gestionstock.services.dto;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.entity.CommandeFournisseur;

public class CommandeFournisseurDTO {

	private Long idLigneCommandeFournisseur;

	private Article article;

	private CommandeFournisseur commandeFournisseur;

	public CommandeFournisseurDTO() {
	}

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(Long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

}
