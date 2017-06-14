package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 6/14/2017.
 */
public class Triangle {
    public void rightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input side A");
        int sideA = scanner.nextInt();
        System.out.println("Please, input side B");
        int sideB = scanner.nextInt();
        System.out.println("Please, input side C");
        int sideC = scanner.nextInt();
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (Math.pow(sideA, 2.0) == Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0)) {
                System.out.println("Side A is a hypotenuse");
            } else if (Math.pow(sideB, 2.0) == Math.pow(sideA, 2.0) + Math.pow(sideC, 2.0)) {
                System.out.println("Side B is a hypotenuse");
            } else if (Math.pow(sideC, 2.0) == Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0)) {
                System.out.println("Side C is a hypotenuse");
            } else
                System.out.println("Your triangle isn't a right triangle");
        } else
            System.out.println("Please, input number greater than 0 for all sides");
    }
}
