package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrieQualityUpdateTest {

    @Test
    void testQualityDegradeInsideDate() {
        BrieQualityUpdate brieQualityChange = new BrieQualityUpdate();
        assertEquals(6, brieQualityChange.updateQuality(1, 5));
        assertEquals(4, brieQualityChange.updateQuality(1, 3));
        assertEquals(2, brieQualityChange.updateQuality(1, 1));
    }
    @Test
    void testQualityDegradeOutsideDate() {
        BrieQualityUpdate brieQualityChange = new BrieQualityUpdate();
        assertEquals(8, brieQualityChange.updateQuality(-1, 6));
        assertEquals(6, brieQualityChange.updateQuality(-1, 4));
        assertEquals(4, brieQualityChange.updateQuality(-1, 2));
    }
}
