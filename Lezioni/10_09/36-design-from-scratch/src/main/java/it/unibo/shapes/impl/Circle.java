package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;
import java.lang.Math;

public class Circle implements Shape {
    private double radius;
    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.pow(getRadius(), 2)*Math.PI);
    }

    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    public String toString() {
        return "Circle:\n"+"Area: " + getArea() + ", Perimeter: "+getPerimeter();
    }

}