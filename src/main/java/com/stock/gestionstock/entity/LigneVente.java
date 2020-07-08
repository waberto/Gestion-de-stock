package com.stock.gestionstock.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ligneVente")
public class LigneVente implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
