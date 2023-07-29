package mypackage;

import pornchai1.Triangle;
import somying.shape.Triangle1;


public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4.0, 6.0);

        System.out.println("Triangle Area: " + triangle.getArea());
        Triangle1 triangle1 = new Triangle1(40.0, 60.0);

        System.out.println("Triangle Area: " + triangle1.getArea());
    
    }
}
