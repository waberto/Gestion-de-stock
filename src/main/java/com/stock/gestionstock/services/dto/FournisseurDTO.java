package com.stock.gestionstock.services.dto;

import java.util.List;

import com.stock.gestionstock.entity.CommandeFournisseur;

public class FournisseurDTO {

	private Long idFournisseur;

	private String nom;
	private String prenom;
	private String adresse;
	private String photo;
	private String mail;

	private List<CommandeFournisseur> commandeFournisseur;

	public FournisseurDTO() {
	}

	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<CommandeFournisseur> getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(List<CommandeFournisseur> commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

}
