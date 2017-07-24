package com.sergeysila.app.homework.lesson5;

import com.sergeysila.app.classwork.lesson4.Triangle;
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
public class TriangleTDD {

    Triangle triangle;
    private static final String data = "rightTriangle.csv";

    @Before
    public void setUp() {
        this.triangle = new Triangle();
    }

    @Test
    @FileParameters(value = "src/test/java/resources/rightTriangle.csv", mapper = CsvWithHeaderMapper.class)
    public void rightTriangle(int sideA, int sideB, int sideC){
        Assert.assertTrue(triangle.rightTriangle(sideA, sideB, sideC));
    }

    @Test
    @FileParameters(value = "src/test/java/resources/notRightTriangle.csv", mapper = CsvWithHeaderMapper.class)
    public void notRightTriangle(int sideA, int sideB, int sideC){
        Assert.assertFalse(triangle.rightTriangle(sideA, sideB, sideC));
    }
}
