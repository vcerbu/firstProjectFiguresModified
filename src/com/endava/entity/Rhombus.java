package com.endava.entity;

/**
 * Created by vcerbu on 4/5/2017.
 */
public class Rhombus extends Square {

    public double side;
    public double diagonal1;
    public double diagonal2;

    public Rhombus(double side, double diagonal1, double diagonal2) {
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "area='" + this.area() + '\'' +
                ", perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}
