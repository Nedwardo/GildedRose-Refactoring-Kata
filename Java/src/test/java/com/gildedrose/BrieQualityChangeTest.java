package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrieQualityChangeTest {

    @Test
    void testQualityNeverGreaterThanFifty() {
        BrieQualityChange brieQualityChange = new BrieQualityChange();
        assertEquals(50, brieQualityChange.updateQuality(0, 60));
        assertEquals(50, brieQualityChange.updateQuality(-1, 70));
        assertEquals(50, brieQualityChange.updateQuality(1, 52));
    }
    @Test
    void testQualityNeverNegative() {
        BrieQualityChange brieQualityChange = new BrieQualityChange();
        assertEquals(0, brieQualityChange.updateQuality(0, -50));
        assertEquals(0, brieQualityChange.updateQuality(-1, -60));
        assertEquals(0, brieQualityChange.updateQuality(1, -70));
    }
    @Test
    void testQualityDegradeInsideDate() {
        BrieQualityChange brieQualityChange = new BrieQualityChange();
        assertEquals(6, brieQualityChange.updateQuality(1, 5));
        assertEquals(4, brieQualityChange.updateQuality(1, 3));
        assertEquals(2, brieQualityChange.updateQuality(1, 1));
    }
    @Test
    void testQualityDegradeOutsideDate() {
        BrieQualityChange brieQualityChange = new BrieQualityChange();
        assertEquals(8, brieQualityChange.updateQuality(-1, 6));
        assertEquals(6, brieQualityChange.updateQuality(-1, 4));
        assertEquals(4, brieQualityChange.updateQuality(-1, 2));
    }
    @Test
    void testUpdateSellInDecreases() {
        BrieQualityChange brieQualityChange = new BrieQualityChange();
        assertEquals(-100, brieQualityChange.updateSellIn(-99));
        assertEquals(69, brieQualityChange.updateSellIn(70));
        assertEquals(-1, brieQualityChange.updateSellIn(0));
    }
}
