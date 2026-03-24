/*
 * ProductFactory.java
 * Factory class for Product Entity
 * Author: Plamedie Dinanga 230082629
 * Date: 21 March 2026
 */
package factory;

import domain.Product;
import domain.Category; 

public class ProductFactory {

    public Product buildProduct(String productId, String name, double price, String description, int quantity, Category category) {
        // Validation
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product Name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        // Build
        return new Product.Builder()
                .setProductId(productId)
                .setName(name)
                .setPrice(price)
                .setDescription(description)
                .setQuantity(quantity)
                .setCategory(category)
                .build();
    }
}
