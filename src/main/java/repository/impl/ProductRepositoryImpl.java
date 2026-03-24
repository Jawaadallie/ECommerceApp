/*
 * ProductRepositoryImpl.java
 * Implementation of Product Repository
 * Author: Plamedie Dinanga 230082629
 * Date: 21 March 2026
 */
package repository.impl;

import domain.Product;
import repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProductRepositoryImpl implements ProductRepository {

    private static Map<String, Product> productStore = new ConcurrentHashMap<>();

    @Override
    public Product save(Product product) {
        if (product != null && product.getProductId() != null) {
            productStore.put(product.getProductId(), product);
            return product;
        }
        return null;
    }

    @Override
    public Product findById(String productId) {
        return productStore.get(productId);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productStore.values());
    }

    @Override
    public void delete(String productId) {
        productStore.remove(productId);
    }

    @Override
    public Product update(Product product) {
        if (product != null && productStore.containsKey(product.getProductId())) {
            return productStore.put(product.getProductId(), product);
        }
        return null;
    }
}
