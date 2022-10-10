package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasQualityUpdateTest {
    @Test
    void testQualityIsAlwaysEighty() {
        SulfurasQualityUpdate sulfurasQualityChange = new SulfurasQualityUpdate();
        assertEquals(80, sulfurasQualityChange.updateQuality(-1, 6));
        assertEquals(80, sulfurasQualityChange.updateQuality(-1, 4));
        assertEquals(80, sulfurasQualityChange.updateQuality(9, 100));
        assertEquals(80, sulfurasQualityChange.updateQuality(-99, 4));
        assertEquals(80, sulfurasQualityChange.updateQuality(99, 80));
    }
}
