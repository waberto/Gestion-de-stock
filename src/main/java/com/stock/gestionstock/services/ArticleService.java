package com.stock.gestionstock.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.repository.IArticleRepository;
import com.stock.gestionstock.services.dto.ArticleDTO;

@Service
public class ArticleService {

	@Autowired
	private IArticleRepository repository;
	
	public Article saveArcticle(Article article) {
		return repository.save(article);
	}
	
	public Article updateArticle(ArticleDTO articleDTO) {
		
		//Article existingArticle = repository.findById(article.getIdArticle()).orElse(null);
		
		Article existingArticle = new Article();
		
		existingArticle = repository.findById(articleDTO.getIdArticle()).orElse(null);
		
		existingArticle.setCodeArticle(articleDTO.getCodeArticle());
		existingArticle.setDesignation(articleDTO.getDesignation());
		existingArticle.setPrixUnitaireHT(articleDTO.getPrixUnitaireHT());
		existingArticle.setTauxTva(articleDTO.getTauxTva());
		existingArticle.setPrixUnitaireTTC(articleDTO.getPrixUnitaireTTC());
		existingArticle.setPhoto(articleDTO.getPhoto());
		existingArticle.setCategory(articleDTO.getCategory());
		
		return repository.save(existingArticle);
	}
	
	public List<Article> selectArticle() {
		return repository.findAll();
	}
	
	public List<Article> selectAllArticle(String sortField, String sort) {
		return repository.findAll(sortField, sort);
	}
	
	public Article getArticleById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteArticleById(Long id) {
		repository.deleteById(id);
	}
	
	public Article findArticleByName(String name) {
		return repository.findByName(name);
	}
	
	public Article findArticleByNameList(String[] name) {
		return repository.findByName(name);
	}
	
	public int findCountArticleBy(String name) {
		return repository.findCountBy(name);
	}
}
