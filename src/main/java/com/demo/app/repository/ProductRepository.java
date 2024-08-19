package com.demo.app.repository;

import com.demo.app.entity.Product;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Document(collection = "products")
public interface ProductRepository extends MongoRepository<Product, String> {

    public Optional<Product> findById(String id);

    public List<Product> findByCategory(String category);


    }