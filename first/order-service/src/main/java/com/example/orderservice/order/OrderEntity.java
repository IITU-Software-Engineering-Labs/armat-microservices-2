package com.example.orderservice.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderEntity {
    @Id
    private String id;
    private String productId;
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
