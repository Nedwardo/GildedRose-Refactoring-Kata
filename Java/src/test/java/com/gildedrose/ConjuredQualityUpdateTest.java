package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuredQualityUpdateTest {
    @Test
    void testQualityDegradeInsideDate() {
        ConjuredQualityUpdate conjuredQualityChange = new ConjuredQualityUpdate();
        assertEquals(3, conjuredQualityChange.updateQuality(1, 5));
        assertEquals(1, conjuredQualityChange.updateQuality(1, 3));
        assertEquals(-1, conjuredQualityChange.updateQuality(1, 1));
    }
    @Test
    void testQualityDegradeOutsideDate() {
        ConjuredQualityUpdate conjuredQualityChange = new ConjuredQualityUpdate();
        assertEquals(2, conjuredQualityChange.updateQuality(-1, 6));
        assertEquals(10, conjuredQualityChange.updateQuality(-1, 14));
        assertEquals(-2, conjuredQualityChange.updateQuality(-1, 2));
    }
}
