package com.endava.entity;

import com.endava.abstractclasses.Figure;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Square extends Figure {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area='" + this.area() + '\'' +
                ", perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}
