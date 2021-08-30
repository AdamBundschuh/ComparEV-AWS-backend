package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.Article;

@Service
public class ArticleStorage {

    private ArticleRepository articleRepository;

    public ArticleStorage(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article retrieveArticleById(Long id) {
        return articleRepository.findById(id).get();
    }

    public Iterable<Article> retrieveAllArticles() {
        return articleRepository.findAll();
    }

    public void saveArticle(Article articleToSave) {
        articleRepository.save(articleToSave);
    }
}
