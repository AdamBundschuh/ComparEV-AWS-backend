package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.ArticleTopic;

@Service
public class ArticleTopicStorage {

    private ArticleTopicRepository articleTopicRepository;

    public ArticleTopicStorage(ArticleTopicRepository articleTopicRepository) {
        this.articleTopicRepository = articleTopicRepository;
    }

    public ArticleTopic retrieveArticleTopicById(Long id) {
        return articleTopicRepository.findById(id).get();
    }

    public Iterable<ArticleTopic> retrieveAllArticleTopics() {
        return articleTopicRepository.findAll();
    }

    public void saveArticleTopic(ArticleTopic articleTopicToSave) {
        articleTopicRepository.save(articleTopicToSave);
    }
}
