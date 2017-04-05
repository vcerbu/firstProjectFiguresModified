package com.endava.main;

import com.endava.entity.*;

/**
 * Created by vcerbu on 4/5/2017.
 */
public class Main {
    public static void main(String[] args) {
        //figures with abstract classes, interfaces
        System.out.println("01. Abstract Figures, Interfaces");
        Rhombus rhombus = new Rhombus(2, 1, 4);
        Rectangle rectangle = new Rectangle(2, 3);
        Ellipse ellipse = new Ellipse(4, 5);
        ResizableCircle resizableCircle = new ResizableCircle(3);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(4, 2, 4);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(4);

        System.out.println(rhombus);
        System.out.println(rectangle);
        System.out.println(ellipse);
        System.out.println(resizableCircle);
        System.out.println(isoscelesTriangle);
        System.out.println(equilateralTriangle);
        System.out.println("--------------------------------------------------------------------------------");

    }
}
