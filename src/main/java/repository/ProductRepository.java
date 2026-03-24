/*
 * ProductRepository.java
 * Repository Interface for Product
 * Author: Plamedie Dinanga 230082629
 * Date: 21 March 2026
 */
package repository;

import domain.Product;
import java.util.List;

public interface ProductRepository {
    Product save(Product product);
    Product findById(String productId);
    List<Product> findAll();
    void delete(String productId);
    Product update(Product product);
}
