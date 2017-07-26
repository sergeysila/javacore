package com.sergeysila.app.classwork.lesson6;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ssil on 7/25/2017.
 */
public class Array {

    public static int getRandomValue(int f, int t){
        int from, to;
        Random randomGenerator = new Random();

        if (f > t) {
            from = t;
            to = f;
        } else {
            from = f;
            to = t;
        }
        return randomGenerator.nextInt((to - from) + 1) + from;
    }

    public static int[][] createMultiDimensionArray(int rows, int columns, int f, int t){
        int[][] multiDimensionArray = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for(int k = 0; k < columns; k++){
                int randomInt = Array.getRandomValue(f, t);
                multiDimensionArray[i][k] = randomInt;
            }
        }
        return multiDimensionArray;
    }

    public static void printMultiDimensionArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                int value = array[i][k];
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[] createEvenArray(int f, int t) {
        int[] evenArray = new int[0];
        int from, to;

        if (f > t) {
            from = t;
            to = f;
        } else {
            from = f;
            to = t;
        }

        for (int i = from; i <= to; i++) {
            if (i >= 0 && i % 2 == 0) {
                evenArray = addElement(evenArray, i);
            }
        }
        return evenArray;
    }

    public static int[] reverseArray(int[] inArray) {
        int[] outArray = new int[inArray.length];
        for (int i = 0; i < inArray.length; i++) {
            outArray[outArray.length - i - 1] = inArray[i];
        }
        return outArray;
    }

    public static int[] createOddArray(int f, int t) {
        int[] evenArray = new int[0];
        int from, to;

        if (f > t) {
            from = t;
            to = f;
        } else {
            from = f;
            to = t;
        }

        for (int i = from; i <= to; i++) {
            if (i >= 0 && i % 2 != 0) {
                evenArray = addElement(evenArray, i);
            }
        }
        return evenArray;
    }


    public static int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }

    public static int[] randomArray(int f, int t, int bound) {
        int[] randomArray = new int[0];
        int from, to;
        Random randomGenerator = new Random();

        if (f > t) {
            from = t;
            to = f;
        } else {
            from = f;
            to = t;
        }

        for (int i = from; i <= to; i++) {
            int randomInt = randomGenerator.nextInt(bound);
            randomArray = addElement(randomArray, randomInt);
        }
        return randomArray;
    }

    public static int countEvenElements(int[] array) {
        int counter = 0;
        for (int arrElement : array) {
            if (arrElement % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countOddElements(int[] array) {
        int counter = 0;
        for (int arrElement : array) {
            if (arrElement % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static  int getMinValue(int[] array){
        int minValue = array[0];
        for(int i = 1; i <array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static  int getMaxValue(int[] array){
        int maxValue = 0;
        for(int i = 0; i <array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void printArrayInRow(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArrayInColumn(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }


}
