package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

@Entity
public class ArticleTopic {

    @Id
    @GeneratedValue
    private Long id;
    private String articleTopicTitle;
    private String articleTopicParallaxUrl;

    @OneToMany(mappedBy = "articleTopic")
    private Collection<Article> articles;

    protected ArticleTopic() {

    }

    public ArticleTopic(String articleTopicTitle, String articleTopicParallaxUrl) {
        this.articleTopicTitle = articleTopicTitle;
        this.articleTopicParallaxUrl = articleTopicParallaxUrl;
    }

    public Long getId() {
        return id;
    }

    public String getArticleTopicTitle() {
        return articleTopicTitle;
    }

    public String getArticleTopicParallaxUrl() {
        return articleTopicParallaxUrl;
    }

    public Collection<Article> getArticles() {
        return articles;
    }
}
