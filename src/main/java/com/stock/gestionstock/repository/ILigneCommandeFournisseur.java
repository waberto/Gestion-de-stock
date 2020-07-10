package com.stock.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.entity.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseur extends JpaRepository<LigneCommandeFournisseur, Long> {

	
}
