package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon { //equilatero
    private final int N_EDGES = 3;

    private double base;
    public double getBase() {
        return this.base;
    }

    private double height;
    public double getHeight() {
        return this.height;
    }
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (getBase()*getHeight())/2;
    }

    public double getPerimeter() {
        return getBase()*N_EDGES;
    }

    public int getEdgeCount() {
        return N_EDGES;
    }

    public String toString() {
        return "Triangle (n_edges: "+getEdgeCount()+"):\n"+"Area: " + getArea() + ", Perimeter: "+getPerimeter();
    }
}