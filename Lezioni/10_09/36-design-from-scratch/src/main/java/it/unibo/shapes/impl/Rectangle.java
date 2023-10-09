package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {
    private final int N_EDGES = 4;

    private double base;
    public double getBase() {
        return this.base;
    }

    private double height;
    public double getHeight() {
        return this.height;
    } 

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return getBase()*getHeight();
    }
    public double getPerimeter() {
        return ((2*getBase())+2*(getHeight()));
    }
    
    public int getEdgeCount() {
        return N_EDGES;
    }

    public String toString() {
        return "Rectangle (n_edges: "+getEdgeCount()+"):\n"+"Area: " + getArea() + ", Perimeter: "+getPerimeter();
    }
}