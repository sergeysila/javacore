package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 7/14/2017.
 */
public class MyNumber {
    public void evenNumberCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is odd");
        }
    }

    public void checkIsBigger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " bigger than " + secondNumber);
        }
        else if (firstNumber < secondNumber){
            System.out.println(secondNumber + " bigger than " + firstNumber);
        }
        else {
            System.out.println("secondNumber and firstNumber are equal");
        }
    }
}
