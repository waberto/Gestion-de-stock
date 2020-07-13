package com.stock.gestionstock.services.dto;

import java.util.Date;
import java.util.List;


import com.stock.gestionstock.entity.LigneVente;

public class VenteDTO {

	private Long idVente;

	private String code;

	private Date dateVente;

	private List<LigneVente> ligneVentes;

	public VenteDTO() {
	}

	public Long getIdVente() {
		return idVente;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}

	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}

}
