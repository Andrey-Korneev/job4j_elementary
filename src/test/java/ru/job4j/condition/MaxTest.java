package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To7Then7() {
        int left = 4;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3And8And5Then8() {
        int first = 3;
        int second = 8;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4And4And2Then4() {
        int first = 4;
        int second = 4;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2And7And1And5Then7() {
        int first = 2;
        int second = 7;
        int third = 1;
        int forth = 5;
        int result = Max.max(first, second, third, forth);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4And9And3And9Then9() {
        int first = 4;
        int second = 9;
        int third = 3;
        int forth = 9;
        int result = Max.max(first, second, third, forth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}