package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman160Then69() {
        short in = 160;
        double expected = 69;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}