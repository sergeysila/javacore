package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 6/14/2017.
 */
public class CircleArea {
    public static final double PI = 3.14d;

    public static double calculateArea(double radius) {
        if (radius != 0) {
            double area = PI * Math.pow(radius, 2.0);
            System.out.println("Area of your circle is: " + area);
            return area;

        }
        else {
            System.out.println("Radius cannot be zero");
            return 0;
        }
    }
}
