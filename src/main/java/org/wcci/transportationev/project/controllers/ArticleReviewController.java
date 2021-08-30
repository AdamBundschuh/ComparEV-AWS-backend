package org.wcci.transportationev.project.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.*;
import org.wcci.transportationev.project.resources.Article;
import org.wcci.transportationev.project.resources.ArticleTopic;
import org.wcci.transportationev.project.resources.ChargeCost;
import org.wcci.transportationev.project.resources.ElectricVehicle;
import org.wcci.transportationev.project.storage.ArticleStorage;
import org.wcci.transportationev.project.storage.ArticleTopicStorage;
import org.wcci.transportationev.project.storage.ChargeCostRepository;
import org.wcci.transportationev.project.storage.ElectricVehicleStorage;

@RestController
public class ArticleReviewController {

    private ArticleTopicStorage articleTopicStorage;
    private ArticleStorage articleStorage;
    private ElectricVehicleStorage electricVehicleStorage;
    private ChargeCostRepository chargeCostRepo;

    public ArticleReviewController(ArticleTopicStorage articleTopicStorage, ArticleStorage articleStorage,
            ElectricVehicleStorage electricVehicleStorage, ChargeCostRepository chargeCostRepo) {
        this.articleTopicStorage = articleTopicStorage;
        this.articleStorage = articleStorage;
        this.electricVehicleStorage = electricVehicleStorage;
        this.chargeCostRepo = chargeCostRepo;
    }

    // GET http://localhost:8080/api/articleTopics
    @GetMapping("/api/articleTopics")
    public Iterable<ArticleTopic> retrieveAllArticleTopics() {
        return articleTopicStorage.retrieveAllArticleTopics();
    }

    // GET http://localhost:8080/api/electricVehicles
    @GetMapping("/api/electricVehicles")
    public Iterable<ElectricVehicle> retrieveAllElectricVehicles() {
        return electricVehicleStorage.retrieveAllElectricVehicles();
    }

    // GET http://localhost:8080/api/articleTopics/1
    @GetMapping("/api/articleTopics/{id}")
    public ArticleTopic retrieveArticleTopicById(@PathVariable Long id) {
        return articleTopicStorage.retrieveArticleTopicById(id);
    }

    // GET http://localhost:8080/api/electricVehicles/111
    @GetMapping("/api/electricVehicles/{id}")
    public ElectricVehicle retrieveElectricVehicleById(@PathVariable Long id) {
        return electricVehicleStorage.retrieveElectricVehicleById(id);
    }

    // GET http://localhost:8080/api/articleTopics/1/articles
    @GetMapping("/api/articleTopics/{id}/articles")
    public Iterable<Article> retrieveAllArticlesInTopic(@PathVariable Long id) {
        return articleTopicStorage.retrieveArticleTopicById(id).getArticles();
    }

    // GET http://localhost:8080/api/articles
    @GetMapping("/api/articles")
    public Iterable<Article> retrieveAllArticles() {
        return articleStorage.retrieveAllArticles();
    }

    // GET http://localhost:8080/api/articleTopics/4/articles/5
    @GetMapping("/api/articleTopics/{id}/articles/{articleId}")
    public Article retrieveArticleById(@PathVariable Long id, @PathVariable Long articleId) {
        return articleStorage.retrieveArticleById(articleId);
    }

    // PATCH http://localhost:8080/api/articleTopics/7/articles/9/comments
    @PatchMapping("/api/articleTopics/{id}/articles/{articleId}/{comments}")
    public Article addNewArticleComment(@PathVariable Long id, @PathVariable Long articleId,
            @RequestBody String newArticleComment) {
        Article articleToChange = articleStorage.retrieveArticleById(articleId);
        articleToChange.addArticleComment(newArticleComment);
        articleStorage.saveArticle(articleToChange);
        return articleToChange;
    }

    // PATCH http://localhost:8080/api/electricVehicles/121/comments
    @PatchMapping("/api/electricVehicles/{id}/comments")
    public ElectricVehicle addNewElectricVehicleComment(@PathVariable Long id, @RequestBody String newReviewComment) {
        ElectricVehicle electricVehicleToChange = electricVehicleStorage.retrieveElectricVehicleById(id);
        electricVehicleToChange.addElectricVehicleComment(newReviewComment);
        electricVehicleStorage.saveElectricVehicle(electricVehicleToChange);
        return electricVehicleToChange;
    }

    // GET http://localhost:8080/api/electricVehicles/price
    @GetMapping("/api/electricVehicles/compare/{price}")
    public Collection<ElectricVehicle> retrieveEVsBasedOnLifestyle(@PathVariable int price) {
        return electricVehicleStorage.retrieveEVsByPrice(price);
    }

    // GET http://localhost:8080/api/ev/charge/{stateName}
    @GetMapping("/api/ev/charge/{stateName}")
    public ChargeCost retrieveChargeCostByStateName(@PathVariable String stateName) {
        return chargeCostRepo.findChargeCostByState(stateName);
    }

}
