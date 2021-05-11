package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTestJUnitJupiterAPI {
    CashbackHackService bonus = new CashbackHackService();
    @org.junit.Test
    public void testRemainZero() {
        int actual = bonus.remain(0);
        int expected = 1000;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainOne() {
        int actual = bonus.remain(1);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainHalf() {
        int actual = bonus.remain(500);
        int expected = 500;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain999() {
        int actual = bonus.remain(999);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain1001() {
        int actual = bonus.remain(1001);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain1000() {
        int actual = bonus.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainNegative() {
        int actual = bonus.remain(-1);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainOverThousand() {
        int actual = bonus.remain(2530);
        int expected = 470;
        Assert.assertEquals(expected, actual);
    }
}
