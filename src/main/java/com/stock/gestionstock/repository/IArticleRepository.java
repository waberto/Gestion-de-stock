package com.stock.gestionstock.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.gestionstock.entity.Article;


/**
 * Spring Data JPA repository for the Article entity.
 */
@Repository
public interface IArticleRepository extends JpaRepository<Article, Integer> {
	
	@Query("select a from Article a where a.name = :name")
	Article findByName(String name);
		
}
