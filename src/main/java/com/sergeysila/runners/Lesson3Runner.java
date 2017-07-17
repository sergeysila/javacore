package com.sergeysila.runners;

import com.sergeysila.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by ssil on 6/13/2017.
 */
public class Lesson3Runner {
    public static void main (String args[]){
    PrimitiveConvertor pc = new PrimitiveConvertor();
    pc.floatToChar(291.0f);
    pc.intToChar(291);
    pc.charToInt('\u0123');

    }
}
