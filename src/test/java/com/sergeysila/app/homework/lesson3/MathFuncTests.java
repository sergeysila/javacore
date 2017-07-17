package com.sergeysila.app.homework.lesson3;

import com.sergeysila.app.homework.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ssil on 7/17/2017.
 */
public class MathFuncTests {

    @Test
    public void multiplyTest() {
        int a = 3, b = 4, expRes = 12;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyFailedTest(){
        int a = 4, b = 7, expRes = 20;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyZeroTest() {
    int a = 0, b = 88, expRes = 0;
    Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void divideTest() {
        int a = 24, b = 8, expRes = 3;
        Assert.assertEquals(expRes, MathFunc.divide(a, b));
    }

    @Test
    public void divideFailedTest(){
        int a = 7, b = 7, expRes = 20;
        Assert.assertEquals(expRes, MathFunc.divide(a, b));
    }

    @Test
    public void divideZeroTest() {
        int a = 0, b = 55, expRes = 0;
        Assert.assertEquals(expRes, MathFunc.divide(a, b));
    }

    @Test
    public void subtractTest() {
        int a = 24, b = 8, expRes = 16;
        Assert.assertEquals(expRes, MathFunc.subtract(a, b));
    }

    @Test
    public void subtractFailedTest(){
        int a = 7, b = 8, expRes = 5;
        Assert.assertEquals(expRes, MathFunc.subtract(a, b));
    }

    @Test
    public void subtractZeroTest() {
        int a = 0, b = 55, expRes = -55;
        Assert.assertEquals(expRes, MathFunc.subtract(a, b));
    }

    @Test
    public void addTest() {
        int a = 24, b = 8, expRes = 32;
        Assert.assertEquals(expRes, MathFunc.add(a, b));
    }

    @Test
    public void addFailedTest(){
        int a = 7, b = 8, expRes = 27;
        Assert.assertEquals(expRes, MathFunc.add(a, b));
    }

    @Test
    public void addZeroTest() {
        int a = 0, b = 55, expRes = 55;
        Assert.assertEquals(expRes, MathFunc.add(a, b));
    }

    @Test
    public void moduloTest() {
        int a = 25, b = 8, expRes = 1;
        Assert.assertEquals(expRes, MathFunc.modulo(a, b));
    }

    @Test
    public void moduloFailedTest(){
        int a = 10, b = 3, expRes = 3;
        Assert.assertEquals(expRes, MathFunc.modulo(a, b));
    }

    @Test
    public void powTest() {
        double a = 3d, b = 3d, expRes = 27d;
        Assert.assertEquals(expRes, Math.pow(a, b), 0);
    }

    @Test
    public void powFailedTest() {
        double a = 3d, b = 3d, expRes = 2d;
        Assert.assertEquals(expRes, Math.pow(a, b), 0);
    }

    @Test
    public void powZeroTest() {
        double a = 3d, b = 0d, expRes = 1d;
        Assert.assertEquals(expRes, Math.pow(a, b), 0);
    }

    @Test
    public void maxTest() {
        int a = 3, b = 7, expRes = 7;
        Assert.assertEquals(expRes, Math.max(a, b));
    }

    @Test
    public void maxFailedTest() {
        int a = 3, b = 7, expRes = 10;
        Assert.assertEquals(expRes, Math.max(a, b));
    }

    @Test
    public void maxZeroTest() {
        int a = 0, b = -1, expRes = 0;
        Assert.assertEquals(expRes, Math.max(a, b));
    }
}
