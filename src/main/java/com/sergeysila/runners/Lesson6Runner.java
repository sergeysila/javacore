package com.sergeysila.runners;

import com.sergeysila.app.classwork.lesson6.Array;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by ssil on 7/25/2017.
 */
public class Lesson6Runner
{
    public void taskA(){
        int[] evenArray = Array.createEvenArray(2,20);
        Array.printArrayInRow(evenArray);
        Array.printArrayInColumn(evenArray);
    }

    public void taskB(){
        int[] oddArray = Array.createOddArray(1, 99);
        Array.printArrayInRow(oddArray);
        int[] reverseArray = Array.reverseArray(oddArray);
        Array.printArrayInRow(reverseArray);
    }

    public void taskC(){
        int[] randomArray = Array.randomArray(10, 24, 10);
        Array.printArrayInRow(randomArray);
        int countEvenElements = Array.countEvenElements(randomArray);
        System.out.println("Amount of even numbers in array: " + countEvenElements);

    }

    public void taskD(){
        int[] randomArray = Array.randomArray(0, 14, 1000);
        Array.printArrayInRow(randomArray);
        int maxValue = Array.getMaxValue(randomArray);
        System.out.println("Max value of the array is " + maxValue);
        int minValue = Array.getMinValue(randomArray);
        System.out.println("Min value of the array is " + minValue);
    }

    public void taskE(){
        int[][] randomArray = Array.createMultiDimensionArray(8, 5, 10, 99);
        Array.printMultiDimensionArray(randomArray);
    }
}
