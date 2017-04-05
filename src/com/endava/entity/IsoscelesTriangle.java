package com.endava.entity;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class IsoscelesTriangle extends Triangle {

    private double base;
    private double heightBase;
    private double side;

    public IsoscelesTriangle(double side, double base, double heightBase) {
        this.side = side;
        this.base = base;
        this.heightBase = heightBase;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeightBase() {
        return heightBase;
    }

    public double area() {
        return (base * heightBase) / 2;
    }

    public double perimeter() {
        return 2 * this.side + this.base;
    }

    public String toString() {
        return "IsoscelesTriangle{" +
                "area='" + this.area() + '\'' +
                ", perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}
