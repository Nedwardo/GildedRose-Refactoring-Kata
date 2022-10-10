package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassQualityChangeTest {
    @Test
    void testQualityNeverGreaterThanFifty() {
        BackstagePassQualityChange backstagePassQualityChange = new BackstagePassQualityChange();
        assertEquals(50, backstagePassQualityChange.updateQuality(0, 60));
        assertEquals(50, backstagePassQualityChange.updateQuality(99, 70));
        assertEquals(50, backstagePassQualityChange.updateQuality(1, 52));
    }
    @Test
    void testQualityNeverNegative() {
        BackstagePassQualityChange backstagePassQualityChange = new BackstagePassQualityChange();
        assertEquals(0, backstagePassQualityChange.updateQuality(0, -3));
        assertEquals(0, backstagePassQualityChange.updateQuality(-1, -99));
        assertEquals(0, backstagePassQualityChange.updateQuality(1, -4));
    }
    @Test
    void testQualityIncreaseOutsideOfTenDays() {
        BackstagePassQualityChange backstagePassQualityChange = new BackstagePassQualityChange();
        assertEquals(6, backstagePassQualityChange.updateQuality(20, 5));
        assertEquals(4, backstagePassQualityChange.updateQuality(11, 3));
        assertEquals(2, backstagePassQualityChange.updateQuality(50, 1));
    }
    @Test
    void testQualityIncreaseBetweenTenAndFiveDays() {
        BackstagePassQualityChange backstagePassQualityChange = new BackstagePassQualityChange();
        assertEquals(14, backstagePassQualityChange.updateQuality(10, 12));
        assertEquals(49, backstagePassQualityChange.updateQuality(6, 47));
        assertEquals(34, backstagePassQualityChange.updateQuality(7, 32));
    }
    @Test
    void testQualityIncreaseBetweenFiveAndZeroDays() {
        BackstagePassQualityChange backstagePassQualityChange = new BackstagePassQualityChange();
        assertEquals(28, backstagePassQualityChange.updateQuality(0, 25));
        assertEquals(13, backstagePassQualityChange.updateQuality(3, 10));
        assertEquals(20, backstagePassQualityChange.updateQuality(5, 17));
    }
    @Test
    void testQualitySetToZeroAfterDate() {
        BackstagePassQualityChange backstagePassQualityChange = new BackstagePassQualityChange();
        assertEquals(0, backstagePassQualityChange.updateQuality(-99, 47));
        assertEquals(0, backstagePassQualityChange.updateQuality(-5, 5));
        assertEquals(0, backstagePassQualityChange.updateQuality(-1, -9));
    }
    @Test
    void testUpdateSellInDecreases() {
        BackstagePassQualityChange backstagePassQualityChange = new BackstagePassQualityChange();
        assertEquals(-100, backstagePassQualityChange.updateSellIn(-99));
        assertEquals(69, backstagePassQualityChange.updateSellIn(70));
        assertEquals(-1, backstagePassQualityChange.updateSellIn(0));
    }

}
