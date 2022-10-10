package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasQualityChangeTest {
    @Test
    void testQualityIsAlwaysEighty() {
        SulfurasQualityChange sulfurasQualityChange = new SulfurasQualityChange();
        assertEquals(80, sulfurasQualityChange.updateQuality(-1, 6));
        assertEquals(80, sulfurasQualityChange.updateQuality(-1, 4));
        assertEquals(80, sulfurasQualityChange.updateQuality(9, 100));
        assertEquals(80, sulfurasQualityChange.updateQuality(-99, 4));
        assertEquals(80, sulfurasQualityChange.updateQuality(99, 80));
    }
    @Test
    void testUpdateSellInDoesNotChange() {
        SulfurasQualityChange sulfurasQualityChange = new SulfurasQualityChange();
        assertEquals(-99, sulfurasQualityChange.updateSellIn(-99));
        assertEquals(70, sulfurasQualityChange.updateSellIn(70));
        assertEquals(0, sulfurasQualityChange.updateSellIn(0));
    }
}
