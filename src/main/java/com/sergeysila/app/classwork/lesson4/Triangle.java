package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 6/14/2017.
 */
public class Triangle {
    public boolean rightTriangle(int sideA, int sideB, int sideC) {

        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (Math.pow(sideA, 2.0) == Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0)) {
                System.out.println("Your triangle is a right triangle. Side A is a hypotenuse");
                return true;
            } else if (Math.pow(sideB, 2.0) == Math.pow(sideA, 2.0) + Math.pow(sideC, 2.0)) {
                System.out.println("Your triangle is a right triangle. Side B is a hypotenuse");
                return true;
            } else if (Math.pow(sideC, 2.0) == Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0)) {
                System.out.println("Your triangle is a right triangle. Side C is a hypotenuse");
                return true;
            } else
                System.out.println("Your triangle isn't a right triangle");
                return false;
        } else
            System.out.println("Please, input number greater than 0 for all sides");
        return false;
    }
}
