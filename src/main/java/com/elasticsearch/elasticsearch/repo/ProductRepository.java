package com.elasticsearch.elasticsearch.repo;

import com.elasticsearch.elasticsearch.model.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

    List<Product> findByProductName(String productName);

    List<Product> findByCategory(String category);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"productName\": \"?0\"}}]}}")
    List<Product> findByProductNameCustomQuery(String productName);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"category\": \"?0\"}}]}}")
    List<Product> findByCategoryCustomQuery(String category);
}