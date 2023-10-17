package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;
import java.lang.Math;

public class Square implements Polygon {
    private final int N_EDGES = 4;

    private double side;
    public double getSide() {
        return this.side;
    } 

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    public double getPerimeter() {
        return getSide()* N_EDGES;
    }

    public int getEdgeCount() {
        return N_EDGES;
    }

    public String toString() {
        return "Square (n_edges: "+getEdgeCount()+"):\n"+"Area: " + getArea() + ", Perimeter: "+getPerimeter();
    }
}