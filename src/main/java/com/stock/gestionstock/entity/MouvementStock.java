package com.stock.gestionstock.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "mouvementStock")
public class MouvementStock implements Serializable {
	
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
