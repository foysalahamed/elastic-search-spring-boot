package com.elasticsearch.elasticsearch.repo;

import com.elasticsearch.elasticsearch.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
    // custom queries can be added here
}