package ru.khorolskii.lesson_3.lesson_4.controllers;

import ru.khorolskii.lesson_3.lesson_4.data.Product;
import ru.khorolskii.lesson_3.lesson_4.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @GetMapping("/products/change_score")
    public void changeScore(@RequestParam Long productId, @RequestParam Integer delta) {
        productService.changeScore(productId, delta);
    }
}
