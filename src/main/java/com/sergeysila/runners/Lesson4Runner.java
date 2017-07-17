package com.sergeysila.runners;

import com.sergeysila.app.classwork.lesson4.CircleArea;
import com.sergeysila.app.classwork.lesson4.MyNumber;
import com.sergeysila.app.classwork.lesson4.Triangle;

import java.util.Scanner;

/**
 * Created by ssil on 6/14/2017.
 */
public class Lesson4Runner {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number from 1 to 3: ");
    String number = scanner.next();
    switch (number) {
        case "1":
            CircleArea circleArea = new CircleArea();
            circleArea.calculate();
            break;
        case "2":
            MyNumber myNumber = new MyNumber();
            myNumber.checkIsBigger();
            break;
        case "3":
            Triangle triangle = new Triangle();
            triangle.rightTriangle();
        default:
            System.out.println("You are out of range!!!");
    }
    }
}
