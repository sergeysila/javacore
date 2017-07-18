package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 7/14/2017.
 */
public class MyNumber {
    public static void evenNumberCheck(int number){

        if (number%2==0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is odd");
        }
    }

    public static void checkIsBigger(int firstNumber, int secondNumber){

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
