package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ComparableProduct extends ProductImpl implements Comparable<Product>{

    public ComparableProduct(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public int compareTo(Product o) {
        return super.getName().compareTo(o.getName());
    }
}