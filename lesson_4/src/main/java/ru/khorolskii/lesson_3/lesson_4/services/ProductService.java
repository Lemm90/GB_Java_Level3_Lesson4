package ru.khorolskii.lesson_3.lesson_4.services;

import ru.khorolskii.lesson_3.lesson_4.data.Product;
import org.springframework.stereotype.Service;
import ru.khorolskii.lesson_3.lesson_4.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository= productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public void changeScore(Long productId, Integer delta) {
        Product product = productRepository.findById(productId);
        product.setScore(product.getScore() + delta);
    }
}
