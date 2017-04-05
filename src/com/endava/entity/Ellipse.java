package com.endava.entity;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Ellipse extends Circle {

    private double axis1;
    private double axis2;


    public Ellipse(double axis1, double axis2) {
        this.axis1 = axis1;
        this.axis2 = axis2;
    }

    public double getAxis1() {
        return axis1;
    }

    public void setAxis1(double axis1) {
        this.axis1 = axis1;
    }

    public double getAxis2() {
        return axis2;
    }

    public void setAxis2(double axis2) {
        this.axis2 = axis2;
    }

    public double area() {
        return Math.PI * axis1 * axis2;
    }

    public double perimeter() {
        if (axis1 > axis2)
            return 4 * ((Math.PI * axis1 * axis2 + (axis1 - axis2)) / axis1 + axis2);
        else
            return 4 * ((Math.PI * axis1 * axis2 + (axis2 - axis1)) / axis1 + axis2);
    }

    public String toString() {
        return "Ellipse{" +
                "area='" + this.area() + '\'' +
                ", perimeter='" + this.perimeter() + '\'' +
                '}';
    }

}
