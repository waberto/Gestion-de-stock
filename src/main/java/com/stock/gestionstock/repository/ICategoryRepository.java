package com.stock.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.entity.Category;

/**
 * Spring Data JPA repository for the Category entity.
 */
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

	
}
