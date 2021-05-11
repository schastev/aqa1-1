package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTestJUnit4 {
    CashbackHackService bonus = new CashbackHackService();

    @Test
    public void testRemainZero() {
        int actual = bonus.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainOne() {
        int actual = bonus.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainHalf() {
        int actual = bonus.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain999() {
        int actual = bonus.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1001() {
        int actual = bonus.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1000() {
        int actual = bonus.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainNegative() {
        int actual = bonus.remain(-1);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainOverThousand() {
        int actual = bonus.remain(2530);
        int expected = 470;
        assertEquals(expected, actual);
    }
}