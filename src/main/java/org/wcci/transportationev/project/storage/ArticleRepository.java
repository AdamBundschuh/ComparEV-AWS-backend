package org.wcci.transportationev.project.storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.transportationev.project.resources.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    
}
