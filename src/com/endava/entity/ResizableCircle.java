package com.endava.entity;

import com.endava.interfaces.Resizable;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class ResizableCircle extends Circle implements Resizable {

    private double diameter;

    @Override
    public double getDiameter() {
        return diameter;
    }

    @Override
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public ResizableCircle(double diameter) {
        this.diameter = diameter;
    }

    public double area() {
        double radius = this.diameter / 2.0;
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * this.diameter;
    }

    @Override
    public void increase(int parameter) {
        this.diameter *= parameter;
    }

    @Override
    public void decrease(int parameter) {
        this.diameter /= parameter;
    }

    public String toString() {
        return "ResizableCircle{" +
                "area='" + this.area() + '\'' +
                ", perimeter='" + this.perimeter() + '\'' +
                '}';
    }
}
