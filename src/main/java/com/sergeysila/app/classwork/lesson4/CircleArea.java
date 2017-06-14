package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 6/14/2017.
 */
public class CircleArea {
    public static final double PI = 3.14d;
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input radius1");
        double radius1 = scanner.nextDouble();
        System.out.println("Please, input radius2");
        double radius2 = scanner.nextDouble();
        double area1 = PI * Math.pow(radius1, 2.0);
        double area2 = PI * Math.pow(radius2, 2.0);
        if (area1 > area2){
            System.out.println("Area1 is bigger");
        }
        else if (area1 <area2){
            System.out.println("Area2 is bigger");
        }
        else{
            System.out.println("Area1 = Area2");
        }

    }
}
