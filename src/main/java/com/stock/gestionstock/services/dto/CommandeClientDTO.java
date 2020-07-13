package com.stock.gestionstock.services.dto;

import java.util.Date;
import java.util.List;


import com.stock.gestionstock.entity.Client;
import com.stock.gestionstock.entity.LigneCommandeClient;

public class CommandeClientDTO {

	private Long idCommandeClient;

	private String code;

	private Date dateCommande;

	private Client client;

	private List<LigneCommandeClient> ligneCommandeClients;

	public CommandeClientDTO() {
	}

	public Long getIdCommandeClient() {
		return idCommandeClient;
	}

	public void setIdCommandeClient(Long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}

	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}

}
