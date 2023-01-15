package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    void shouldWriteAmountBeforeBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldWriteAmountAfterBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldWriteAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}
