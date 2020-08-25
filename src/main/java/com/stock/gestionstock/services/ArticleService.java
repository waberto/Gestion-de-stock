package com.stock.gestionstock.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.repository.IArticleRepository;
import com.stock.gestionstock.services.dto.ArticleDTO;

@Service
@Transactional
public class ArticleService {

	@Autowired
	private IArticleRepository articleRepository;

	public ArticleService(IArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public Article addArticle(Article article) {
		
		return articleRepository.save(article);
	}

	public List<Article> addArticles(List<Article> article) {

		return articleRepository.saveAll(article);
	}

	public List<Article> selectArticles() {
		return articleRepository.findAll();
	}

//	public List<Article> selectAllArticle() {
//		return articleRepository.findAll();
//	}

	public Article getArticleById(int id) {
		Optional<Article> existingArticle = this.articleRepository.findById(id);
		if(existingArticle.isPresent()) {
			return existingArticle.get();
		} else {
			System.out.println("Article not found with id : " + id);
		}
		return null;
	}

	public Article findArticleByName(String name) {
		return articleRepository.findByName(name);
	}

//	public void deleteArticle(int id) {
//		Optional<Article> existingArticle = this.articleRepository.findById(id);
//		
//		if(existingArticle.isPresent()) {
//			this.articleRepository.delete(existingArticle.get());
//		} else {
//			System.out.println("Article not found with id : " + id);
//		}
//	}
	
	public String deleteArticle(int id) {
		articleRepository.deleteById(id);
		return "product removed || "+id;
	}

	public Article updateArticle(Article article) {

//		Article existingArticle = articleRepository.findById(article.getId()).orElse(null);
//		//Article existingArticle = new Article();
//		System.out.println("MY ID : " + article.getId());
//		existingArticle.setNameArticle(article.getNameArticle());
//		existingArticle.setDesignation(article.getDesignation());
//		existingArticle.setPrixUnitaireHT(article.getPrixUnitaireHT());
//		existingArticle.setTauxTva(article.getTauxTva());
//		existingArticle.setPrixUnitaireTTC(article.getPrixUnitaireTTC());
//		existingArticle.setPhoto(article.getPhoto());
//		existingArticle.setCategory(article.getCategory());

		Optional<Article> existingArticle = this.articleRepository.findById(article.getId());
		
		if(existingArticle.isPresent()) {
			Article updateArticle = existingArticle.get();
			updateArticle.setId(article.getId());
			updateArticle.setNameArticle(article.getNameArticle());
			updateArticle.setDesignation(article.getDesignation());
			updateArticle.setPrixUnitaireHT(article.getPrixUnitaireHT());
			updateArticle.setTauxTva(article.getTauxTva());
			updateArticle.setPrixUnitaireTTC(article.getPrixUnitaireTTC());
			updateArticle.setPhoto(article.getPhoto());
			updateArticle.setCategory(article.getCategory());
			
			articleRepository.save(updateArticle);
			
			return updateArticle;
		} else {
			System.out.println("Article not found with id : " + article.getId());
		}
		return article;
	}

}
