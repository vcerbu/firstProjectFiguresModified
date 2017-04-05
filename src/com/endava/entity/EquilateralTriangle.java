package com.endava.entity;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class EquilateralTriangle extends Triangle {

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        return ((Math.sqrt(3)) / 4) * this.side * this.side;
    }

    public double perimeter() {
        return 3 * this.side;
    }

    public String toString() {
        return "EquilateralTriangle{" +
                "area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
