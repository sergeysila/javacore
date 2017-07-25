package com.sergeysila.app.classwork.lesson6;

import java.util.Arrays;

/**
 * Created by ssil on 7/25/2017.
 */
public class Array {

    public static int[] createEvenArray(int f, int t) {

        int[] evenArray = new int[0];
        int from, to;

        if (f > t){
            from = t;
            to = f;
        }

        else{
            from = f;
            to = t;
        }

        for(int i = from; i <= to; i++){
            if (i >=0 && i%2 ==0){
                evenArray = addElement(evenArray, i);
            }
        }

        return evenArray;
    }

    public static int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length +1);
        a[a.length - 1] = e;
        return a;
    }

    public static void printArrayInRow(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArrayInColumn(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }


}
