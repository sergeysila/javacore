package com.sergeysila.app.classwork.lesson3;

import org.junit.*;
import org.junit.Test;

/**
 * Created by ssil on 6/13/2017.
 */
public class MathFuncTests {
    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));

    }

    @Test
    public void multiplyFailedTest() {
        int a = 1, b = 2, expRes = 7;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}
