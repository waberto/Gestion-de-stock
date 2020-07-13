package com.stock.gestionstock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.gestionstock.entity.Article;


/**
 * Spring Data JPA repository for the Article entity.
 */
@Repository
public interface IArticleRepository extends JpaRepository<Article, Long> {

	public List<Article> findAll(String sortField, String sort);
	
	public Article findByName(String name);
	
	public Article findByName(String[] name);
	
	public int findCountBy(String name);
}
