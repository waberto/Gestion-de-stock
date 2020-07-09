package com.stock.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.entity.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

	
}
