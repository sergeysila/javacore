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
public class CircleAreaTests {

    @Test
    @Parameters({"5, 78.5"})
    public void circleAreaTest(double radius, double expRes){
        Assert.assertEquals(expRes, CircleArea.calculateArea(radius), 0);
    }

    @Test
    @Parameters({"0, 0"})
    public void circleAreaZeroTest(double radius, double expRes){
        Assert.assertEquals(expRes, CircleArea.calculateArea(radius), 0);
    }
}
