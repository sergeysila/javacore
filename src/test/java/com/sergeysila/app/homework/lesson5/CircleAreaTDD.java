package com.sergeysila.app.homework.lesson5;

import com.sergeysila.app.classwork.lesson4.CircleArea;
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
public class CircleAreaTDD {

    CircleArea circleArea;

    @Before
    public void setUp(){
        this.circleArea = new CircleArea();
    }

    @Test
    @FileParameters(value = "src/test/java/resources/circleArea.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateCircleArea(double radius, double expOut){
        Assert.assertEquals(expOut, circleArea.calculateArea(radius), 0);
    }
}
