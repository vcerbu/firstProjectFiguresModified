package com.endava.entity;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Rectangle extends Square {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "area='" + this.area() + '\'' +
                ", perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}
