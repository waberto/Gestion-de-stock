package com.stock.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.entity.CommandeFournisseur;

public interface ICommandeFournisseur extends JpaRepository<CommandeFournisseur, Long> {

	
}
