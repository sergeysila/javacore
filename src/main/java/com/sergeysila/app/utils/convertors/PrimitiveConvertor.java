package com.sergeysila.app.utils.convertors;

/**
 * Created by ssil on 6/13/2017.
 */
public class PrimitiveConvertor {
    public char floatToChar(float f) {
        char c1 = (char) f;
        System.out.println("Input float value is " + f + "Output char value is " + c1);
        return c1;
    }

    public char intToChar(int i) {
        char c2 = (char) i;
        System.out.println("Input integer value is " + i + "Output char value is " + c2);
        return c2;
    }

    public int charToInt(char ch) {
        int i1 = (int) ch;
        System.out.println("Input char value is " + ch + "Output char value is " + i1);
        return i1;
    }
}
