package com.sergeysila.runners;

import com.sergeysila.app.classwork.lesson6.Array;

/**
 * Created by ssil on 8/7/2017.
 */
public class Lesson8Runner {

    public void  sortArrayMin(){
        int[] randomArray = Array.randomArray(0, 9, 5);
        System.out.println("Array before bubble sorting:");
        Array.printArrayInRow(randomArray);
        System.out.println("Array after bubble sorting:");
        Array.sortArrayAsc(randomArray);
        Array.printArrayInRow(randomArray);
    }

    public void  sortArrayMax(){
        int[] randomArray = Array.randomArray(0, 9, 5);
        System.out.println("Array before bubble sorting:");
        Array.printArrayInRow(randomArray);
        System.out.println("Array after bubble sorting:");
        Array.sortArrayDesc(randomArray);
        Array.printArrayInRow(randomArray);
    }
}
