package com.stock.gestionstock.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.gestionstock.entity.Article;
import com.stock.gestionstock.services.ArticleService;
import com.stock.gestionstock.services.dto.ArticleDTO;

@RestController
@RequestMapping("/api/accueil")
@CrossOrigin("*")
public class ArticleRessource {

	@Autowired
	private ArticleService serviceArticle;
	
	public ArticleRessource(ArticleService serviceArticle) {
		this.serviceArticle = serviceArticle;
	}
	
	@PostMapping("/article")
	public Article addArticle(@RequestBody Article article) {
		return serviceArticle.addArticle(article);
	}
	
	@PostMapping("/allArticles")
	public List<Article> addArticles(@RequestBody List<Article> article) {
		return serviceArticle.addArticles(article);
	}
	
	@GetMapping("/articles")
	public List<Article> selectArticles() {
		return serviceArticle.selectArticles();
	}
	
	@GetMapping("/articleById/{id}")
	public Article selectArticleById(@PathVariable int id) {
		return serviceArticle.getArticleById(id);
	}
	
	@GetMapping("/article/{name}")
	public Article findArticleByName(@PathVariable String name) {
		return serviceArticle.findArticleByName(name);
	}
	
	@PutMapping("/update/{id}")
	public Article updateArticle(@PathVariable int id, @RequestBody Article article) {
		article.setId(id);
		return serviceArticle.updateArticle(article);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteArticle(@PathVariable int id) {
		return serviceArticle.deleteArticle(id);
	}
}
