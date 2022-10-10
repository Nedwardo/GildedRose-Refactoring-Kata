package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultQualityChangeTest {
    @Test
    void testQualityNeverGreaterThanFifty() {
        DefaultQualityChange defaultQualityChange = new DefaultQualityChange();
        assertEquals(50, defaultQualityChange.updateQuality(0, 60));
        assertEquals(50, defaultQualityChange.updateQuality(-1, 70));
        assertEquals(50, defaultQualityChange.updateQuality(1, 52));
    }
    @Test
    void testQualityNeverNegative() {
        DefaultQualityChange defaultQualityChange = new DefaultQualityChange();
        assertEquals(0, defaultQualityChange.updateQuality(0, 0));
        assertEquals(0, defaultQualityChange.updateQuality(-1, 1));
        assertEquals(0, defaultQualityChange.updateQuality(1, -4));
    }
    @Test
    void testQualityDegradeInsideDate() {
        DefaultQualityChange defaultQualityChange = new DefaultQualityChange();
        assertEquals(4, defaultQualityChange.updateQuality(1, 5));
        assertEquals(2, defaultQualityChange.updateQuality(1, 3));
        assertEquals(0, defaultQualityChange.updateQuality(1, 1));
    }
    @Test
    void testQualityDegradeOutsideDate() {
        DefaultQualityChange defaultQualityChange = new DefaultQualityChange();
        assertEquals(4, defaultQualityChange.updateQuality(-1, 6));
        assertEquals(2, defaultQualityChange.updateQuality(-1, 4));
        assertEquals(0, defaultQualityChange.updateQuality(-1, 2));
    }
    @Test
    void testUpdateSellInDecreases() {
        DefaultQualityChange defaultQualityChange = new DefaultQualityChange();
        assertEquals(-100, defaultQualityChange.updateSellIn(-99));
        assertEquals(69, defaultQualityChange.updateSellIn(70));
        assertEquals(-1, defaultQualityChange.updateSellIn(0));
    }
}
