package com.sergeysila.app.homework.lesson5;

import com.sergeysila.app.classwork.lesson4.MyNumber;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by ssil on 7/24/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MyNumberTDD {
    MyNumber myNumber;

    @Before
    public void setUp(){
        this.myNumber = new MyNumber();
    }

    @Test
    @FileParameters(value = "src/test/java/resources/myNumber.csv", mapper = CsvWithHeaderMapper.class)
    public void checkBigger(int number1, int number2, int expOut){
        Assert.assertEquals(expOut, myNumber.checkIsBigger(number1, number2));
    }
}
