package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 6/14/2017.
 */
public class CircleArea {
    public static final double PI = 3.14d;

    public static void calculateArea(double radius) {
        if (radius > 0) {
            double area = PI * Math.pow(radius, 2.0);
            System.out.println("Area of your circle is: " + area);

        } else if (radius == 0) {
            System.out.println("Radius cannot be zero");
        } else {
            System.out.println("Please, enter valid radius");
        }

    }
}
