package com.sergeysila.app.classwork.lesson4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by ssil on 7/18/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MyNumberTests {

    MyNumber myNumber;

    @Before
    public void setUp(){
        this.myNumber = new MyNumber();
    }

    @Test
    @Parameters({"4"})
    public void evenNumberTest(int number) {
        Assert.assertTrue(myNumber.evenNumberCheck(number));
    }

    @Test
    @Parameters({"0"})
    public void evenNumberZeroTest(int number) {
        Assert.assertTrue(myNumber.evenNumberCheck(number));
    }

    @Test
    @Parameters({"5"})
    public void evenNumberNegativeTest(int number) {
        Assert.assertFalse(myNumber.evenNumberCheck(number));
    }

    @Test
    @Parameters({"5, 7, 7", "7, 5, 7", "0, 0, 0"})
    public void checkIsBigger(int number1, int number2, int expRes){
    Assert.assertEquals(expRes, myNumber.checkIsBigger(number1, number2));
    }
}
