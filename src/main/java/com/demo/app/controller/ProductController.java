package com.demo.app.controller;

import com.demo.app.entity.Product;
import com.demo.app.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConditionalOnBean(ProductRepository.class)
public class ProductController {
    private static Logger log = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductRepository repository;



    @GetMapping("/product")
    public List<Product> getAllProduct() {
        log.info("Query all documents");
        log.info("--------------------------------");
        return repository.findAll();

    }

    @DeleteMapping("/product")
    public void deleteAllProduct() {

        log.info("Delete all existing documents");
        log.info("--------------------------------");
        repository.deleteAll();
        log.info("Collection is now empty");
        log.info("--------------------------------");

        log.info("Create first document");
        log.info("--------------------------------");

    }


    @GetMapping("/saveproduct")
    public void saveProduct() {
        Product first = new Product(
                "gear-surf-surfboards",
                "Sunnox Surfboard",
                8,
                true
        );
        first = repository.save(first);
        log.info(first.toString());
        log.info("--------------------------------");

        log.info("Create second document");
        log.info("--------------------------------");
        Product second = new Product(
                "gear-surf-surfboards",
                "Noosa Surfboard",
                15,
                false
        );
        second = repository.save(second);
        log.info(second.toString());
        log.info("--------------------------------");

        log.info("Create second document");
        log.info("--------------------------------");
        Product third = new Product(
                "gear-surf-wetsuits",
                "Plorif Surf Wetsuit",
                2,
                false
        );
        third = repository.save(third);
        log.info(third.toString());
        log.info("--------------------------------");

    }

    public List<Product> filterProduct() {
        log.info("--------------------------------");

        log.info("Query documents using a filter");
        log.info("--------------------------------");

        return repository.findByCategory("gear-surf-surfboards");
        /*for (Product product : repository.findByCategory("gear-surf-surfboards")) {
            log.info(product.toString());
        }*/
    }


    @GetMapping("/product2")
    public Product findProduct() {

        log.info("--------------------------------");

        log.info("Fetch a specific document");
        log.info("--------------------------------");
        return repository.findById(2 +"").orElse(null);
        /*Optional<Product> match = repository.findById(2 +"");
        if (match.isPresent()) {
            log.info(match.get().toString());
        }*/
        //log.info("--------------------------------");
    }
}
