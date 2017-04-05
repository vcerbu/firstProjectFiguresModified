package com.endava.abstractclasses;

import com.endava.interfaces.Shape;

/**
 * Created by vcerbu on 4/5/2017.
 */
public abstract class Figure implements Shape {
    private double dimension;

    public Figure() {
    }

    public Figure(double dimension) {
        this.dimension = dimension;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }
}
