package com.stock.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.gestionstock.entity.Article;

public interface IArticleRepository extends JpaRepository<Article, Long> {

	
}
