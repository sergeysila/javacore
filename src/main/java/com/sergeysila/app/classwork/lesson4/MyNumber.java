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
}
