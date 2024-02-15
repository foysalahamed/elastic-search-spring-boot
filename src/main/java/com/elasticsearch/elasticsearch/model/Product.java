package com.elasticsearch.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "books")
public class Product {
    @Id
    private String id;
    private String title;
    private String author;

    // getters and setters
}
