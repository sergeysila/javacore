package com.sergeysila.runners;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by ssil on 7/25/2017.
 */
public class Lesson6Runner
{
    public void compareTwoDigits(){
        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        System.out.println("Please enter second number: ");
        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner2.nextDouble();

        if (number1 <= number2){
            System.out.println("number1 = " + number1 + "and number2 = " + " " + number2);
        }

        while (number1 > number2){
            System.out.println("number 1 =" + number1 + "and number2 = " + " " + number2);
            number1--;
            if (number1 <= number2){
                System.out.println("number 1 =" + number1 + "and number2 = " + " " + number2);
                break;
            }
        }
    }

    public void printTenNumbers(){
        int f;
        for (f=0; f < 11; f++){
            System.out.println("F = " + f);
        }
    }

    public void countEvenNumbers(){
        int a;
        int count = 0;
        for (a=0; a < 21; a++){
            if(a%2==0){
                count++;
            }
        }
        System.out.println("Amount of even numrers is " + count);
    }

    public void displayEvenNumbers(){
        int i;
        int t;
        int [] array = new int[21];
        int [] array2 = new int[21];

        for (i = 2; i < array.length; i+=2){
            array[i] = i;
            System.out.print(array[i] + " ");
        }

        System.out.println("");

        for(t = 2; t < array2.length; t+=2){
            array2[t] = t;
            System.out.println(array2[t]);
        }
    }
}
