package ru.netology.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldWriteAmountBeforeBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldWriteAmountAfterBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldWriteAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}
