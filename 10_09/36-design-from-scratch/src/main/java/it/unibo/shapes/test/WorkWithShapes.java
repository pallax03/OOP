package it.unibo.shapes.test;

import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {

    public static void main(String[] args) {
        Circle cerchio = new Circle(1.0);
        Rectangle rettangolo = new Rectangle(2, 2);
        Square quadrato = new Square(10);
        Triangle triangolo = new Triangle(10,2);

        System.out.println(cerchio);
        System.out.println(rettangolo);
        System.out.println(quadrato);
        System.out.println(triangolo);
    }
}