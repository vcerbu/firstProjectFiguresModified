package com.endava.entity;

import com.endava.abstractclasses.Figure;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Circle extends Figure {

    private double diameter;

    public Circle() {
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double area() {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
