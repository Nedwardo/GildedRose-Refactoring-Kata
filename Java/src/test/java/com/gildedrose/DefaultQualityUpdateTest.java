package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultQualityUpdateTest {
    @Test
    void testQualityDegradeInsideDate() {
        DefaultQualityUpdate defaultQualityChange = new DefaultQualityUpdate();
        assertEquals(4, defaultQualityChange.updateQuality(1, 5));
        assertEquals(2, defaultQualityChange.updateQuality(1, 3));
        assertEquals(0, defaultQualityChange.updateQuality(1, 1));
    }
    @Test
    void testQualityDegradeOutsideDate() {
        DefaultQualityUpdate defaultQualityChange = new DefaultQualityUpdate();
        assertEquals(4, defaultQualityChange.updateQuality(-1, 6));
        assertEquals(2, defaultQualityChange.updateQuality(-1, 4));
        assertEquals(0, defaultQualityChange.updateQuality(-1, 2));
    }
}
