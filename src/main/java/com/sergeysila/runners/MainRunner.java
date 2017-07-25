package com.sergeysila.runners;

import com.sergeysila.app.classwork.lesson6.Array;

/**
 * Created by ssil on 7/18/2017.
 */
public class MainRunner {
    public static void main(String args []){

        Array.printArrayInRow(Array.createEvenArray(2, 20));
        Array.printArrayInColumn(Array.createEvenArray(2, 20));
    }
}
