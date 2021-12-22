package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to25then2dot236() {
        double expected = 2.236;
        Point a = new Point(1, 3);
        Point b = new Point(2, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when38to14then4dot472() {
        double expected = 4.472;
        Point a = new Point(3, 8);
        Point b = new Point(1, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when56to21then5dot831() {
        double expected = 5.831;
        Point a = new Point(5, 6);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5dot196() {
        double expected = 5.196;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when361to924then7dot810() {
        double expected = 7.810;
        Point a = new Point(3, 6, 1);
        Point b = new Point(9, 2, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}