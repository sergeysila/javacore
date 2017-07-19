package com.sergeysila.runners;


import com.sergeysila.app.classwork.lesson4.CircleArea;
import com.sergeysila.app.classwork.lesson4.MyNumber;
import com.sergeysila.app.classwork.lesson4.Triangle;

import java.util.Scanner;

/**
 * Created by ssil on 6/14/2017.
 */
public class Lesson4Runner {

    public CircleArea circleArea = new CircleArea();
    public MyNumber myNumber = new MyNumber();
    public Triangle triangle = new Triangle();

   public void defineCircleArea(){
       System.out.println("Hello! This is program for calculating circle area!");
       System.out.println("Please, input radius for calculating: ");
       Scanner scanner = new Scanner(System.in);
       circleArea.calculateArea(scanner.nextDouble());
   }

   public void defineBiggerNumber(){
       System.out.println("Hello! This is program for defining bigger number");
       System.out.println("Please, input first number: ");
       Scanner scanner = new Scanner(System.in);
       int number1 = scanner.nextInt();
       System.out.println("Please, input second number: ");
       int number2 = scanner.nextInt();
       myNumber.checkIsBigger(number1, number2);
   }

   public void defineEvenNumber(){
       System.out.println("Hello! This is program for defining even number or not");
       System.out.println("Please, input the number: ");
       Scanner scanner = new Scanner(System.in);
       myNumber.evenNumberCheck(scanner.nextInt());
   }

    public void defineTriangle(){
        System.out.println("Hello! This is program for defining type of triangle");
        System.out.println("Please, input side A: ");
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        System.out.println("Please, input side B: ");
        int sideB = scanner.nextInt();
        System.out.println("Please, input side C: ");
        int sideC = scanner.nextInt();
        triangle.rightTriangle(sideA, sideB, sideC);
    }

    public void chooseProgram(){
        System.out.println("Hello! This is program helps you to choose which calculation to execute :)");
        System.out.println("If you want to calculate circle area - press 1");
        System.out.println("If you want to calculate bigger number - press 2");
        System.out.println("If you want to calculate even number - press 3");
        System.out.println("If you want to define triangle - press 4");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch(userChoice) {
            case 1:
                this.defineCircleArea();
                break;
            case 2:
                this.defineBiggerNumber();
                break;
            case 3:
                this.defineEvenNumber();
                break;
            case 4:
                this.defineTriangle();
                break;
            default:
                System.out.println("Your input was wrong! please repeat later");
        }
    }
}
