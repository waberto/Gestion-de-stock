package com.stock.gestionstock.services.dto;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.entity.CommandeClient;

public class LigneCommandeClientDTO {

	private Long idLigneCommandeClient;

	private Article article;

	private CommandeClient commandeClient;

	public LigneCommandeClientDTO() {
	}

	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}

	public void setIdLigneCommandeClient(Long idLigneCommandeClient) {
		this.idLigneCommandeClient = idLigneCommandeClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

}
