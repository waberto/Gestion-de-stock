package com.stock.gestionstock.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligneCommandeClient")
public class LigneCommandeClient implements Serializable {

	@Id
	@GeneratedValue
	private Long idLigneCommandeClient;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private CommandeClient commandeClient;

	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}

	public void setIdLigneCommandeClient(Long id) {
		this.idLigneCommandeClient = id;
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
