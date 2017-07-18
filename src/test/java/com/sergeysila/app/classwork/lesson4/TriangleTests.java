package com.sergeysila.app.classwork.lesson4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by ssil on 7/18/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class TriangleTests {

    @Test
    @Parameters({"3, 4, 5", "4, 5, 3", "5, 4, 3"})
    public void rightTriangleTest(int a, int b, int c) {
        //Assert.assertEquals(d, Triangle.rightTriangle(a, b, c));
        Assert.assertTrue(Triangle.rightTriangle(a, b, c));
    }

    @Test
    @Parameters({"1, 1, 1", "0, 1, 2"})
    public void rightTriangleNegativeTests(int a, int b, int c) {
        Assert.assertFalse(Triangle.rightTriangle(a, b, c));
    }
}

