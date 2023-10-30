package it.unibo.collections.design.impl;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

public class WarehouseImpl implements Warehouse {

    HashSet<Product> product_set;

    public WarehouseImpl() {
        this.product_set = new LinkedHashSet<>();
    }

    @Override
    public void addProduct(Product p) {
        try {
            this.product_set.add(p);    
        } catch (Exception e) {
            System.out.println(p.getName() + "already in the warehouse!");
        }
        
    }

    @Override
    public Set<String> allNames() {
        Set<String> products_names = new LinkedHashSet<String>();
        var product_iterator = this.product_set.iterator();
        while(product_iterator.hasNext()) {
            products_names.add(product_iterator.next().getName());
        }
        return products_names;
    }

    @Override
    public Set<Product> allProducts() {
        return new LinkedHashSet<Product>(this.product_set);
    }

    @Override
    public boolean containsProduct(Product p) {
        for (Product product : product_set) {
            return product.equals(p);
        }
        return false;
    }

    @Override
    public double getQuantity(String name) {
        for (Product product : product_set) {
            if(product.getName().equals(name)) return product.getQuantity();
        }
        return -1;
    }
    
}
