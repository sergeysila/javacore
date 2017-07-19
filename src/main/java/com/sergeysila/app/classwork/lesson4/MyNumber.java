package com.sergeysila.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ssil on 7/14/2017.
 */
public class MyNumber {

    public boolean evenNumberCheck(int number){

        if (number%2==0){
            System.out.println("Your number is even");
            return true;
        }
        else{
            System.out.println("Your number is odd");
            return false;
        }
    }

    public int checkIsBigger(int firstNumber, int secondNumber){

        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " bigger than " + secondNumber);
            return firstNumber;
        }
        else if (firstNumber < secondNumber){
            System.out.println(secondNumber + " bigger than " + firstNumber);
            return secondNumber;
        }
        else {
            System.out.println("secondNumber and firstNumber are equal");
            return (secondNumber + firstNumber)/2;
        }
    }
}
