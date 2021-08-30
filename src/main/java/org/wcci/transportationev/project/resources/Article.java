package org.wcci.transportationev.project.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String articleTitle;
    private String authorName;
    private String imageUrl;

    @ManyToOne
    @JsonIgnore
    private ArticleTopic articleTopic;

    @Lob
    private String articleContent;

    @Lob
    @ElementCollection
    private Collection<String> articleComments;

    protected Article() {

    }

    public Article(ArticleTopic articleTopic, String articleTitle, String authorName, String imageUrl,
                   String articleContent, String... articleComments) {
        this.articleTopic = articleTopic;
        this.articleTitle = articleTitle;
        this.authorName = authorName;
        this.imageUrl = imageUrl;
        this.articleContent = articleContent;
        this.articleComments = Set.of(articleComments);
    }

    public Long getId() {
        return id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ArticleTopic getArticleTopic() {
        return articleTopic;
    }

    public String getArticleTopicTitle() {
        return this.articleTopic.getArticleTopicTitle();
    }

    public long getArticleTopicId() {
        return articleTopic.getId();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public Iterable<String> getArticleComments() {
        return articleComments;
    }

    public void addArticleComment(String newArticleComment) {
        this.articleComments.add(newArticleComment);
    }
}
