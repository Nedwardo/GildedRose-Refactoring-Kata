package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuredQualityChangeTest {
    @Test
    void testQualityNeverGreaterThanFifty() {
        ConjuredQualityChange conjuredQualityChange = new ConjuredQualityChange();
        assertEquals(50, conjuredQualityChange.updateQuality(0, 60));
        assertEquals(50, conjuredQualityChange.updateQuality(-1, 70));
        assertEquals(50, conjuredQualityChange.updateQuality(1, 52));
    }
    @Test
    void testQualityNeverNegative() {
        ConjuredQualityChange conjuredQualityChange = new ConjuredQualityChange();
        assertEquals(0, conjuredQualityChange.updateQuality(0, 0));
        assertEquals(0, conjuredQualityChange.updateQuality(-1, 1));
        assertEquals(0, conjuredQualityChange.updateQuality(1, -4));
    }
    @Test
    void testQualityDegradeInsideDate() {
        ConjuredQualityChange conjuredQualityChange = new ConjuredQualityChange();
        assertEquals(3, conjuredQualityChange.updateQuality(1, 5));
        assertEquals(1, conjuredQualityChange.updateQuality(1, 3));
        assertEquals(0, conjuredQualityChange.updateQuality(1, 1));
    }
    @Test
    void testQualityDegradeOutsideDate() {
        ConjuredQualityChange conjuredQualityChange = new ConjuredQualityChange();
        assertEquals(2, conjuredQualityChange.updateQuality(-1, 6));
        assertEquals(10, conjuredQualityChange.updateQuality(-1, 14));
        assertEquals(0, conjuredQualityChange.updateQuality(-1, 2));
    }
    @Test
    void testUpdateSellInDecreases() {
        ConjuredQualityChange conjuredQualityChange = new ConjuredQualityChange();
        assertEquals(-100, conjuredQualityChange.updateSellIn(-99));
        assertEquals(69, conjuredQualityChange.updateSellIn(70));
        assertEquals(-1, conjuredQualityChange.updateSellIn(0));
    }

}
