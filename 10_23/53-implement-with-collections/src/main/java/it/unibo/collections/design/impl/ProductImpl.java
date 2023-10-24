package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product {

    private String name;
    private double quantity;

    public ProductImpl() {}

    public ProductImpl(String name, int quantity) {
        this.name = new String(name);
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getQuantity() {
        return this.quantity;
    }
    @Override

    public boolean equals(Object o) 
    {
        Product p = (Product) o;

        return this.getName().equals(p.getName()) && this.getQuantity() == p.getQuantity();
    }
}
