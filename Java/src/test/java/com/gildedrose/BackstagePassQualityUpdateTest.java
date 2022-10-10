package com.gildedrose;

import com.gildedrose.itemUpdate.qualityUpdate.BackstagePassQualityUpdate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassQualityUpdateTest {
    @Test
    void testQualityIncreaseOutsideOfTenDays() {
        BackstagePassQualityUpdate backstagePassQualityChange = new BackstagePassQualityUpdate();
        assertEquals(6, backstagePassQualityChange.updateQuality(20, 5));
        assertEquals(4, backstagePassQualityChange.updateQuality(11, 3));
        assertEquals(2, backstagePassQualityChange.updateQuality(50, 1));
    }
    @Test
    void testQualityIncreaseBetweenTenAndFiveDays() {
        BackstagePassQualityUpdate backstagePassQualityChange = new BackstagePassQualityUpdate();
        assertEquals(14, backstagePassQualityChange.updateQuality(10, 12));
        assertEquals(49, backstagePassQualityChange.updateQuality(6, 47));
        assertEquals(34, backstagePassQualityChange.updateQuality(7, 32));
    }
    @Test
    void testQualityIncreaseBetweenFiveAndZeroDays() {
        BackstagePassQualityUpdate backstagePassQualityChange = new BackstagePassQualityUpdate();
        assertEquals(28, backstagePassQualityChange.updateQuality(1, 25));
        assertEquals(13, backstagePassQualityChange.updateQuality(3, 10));
        assertEquals(20, backstagePassQualityChange.updateQuality(5, 17));
    }
    @Test
    void testQualitySetToZeroAfterDate() {
        BackstagePassQualityUpdate backstagePassQualityChange = new BackstagePassQualityUpdate();
        assertEquals(0, backstagePassQualityChange.updateQuality(-99, 47));
        assertEquals(0, backstagePassQualityChange.updateQuality(-5, 5));
        assertEquals(0, backstagePassQualityChange.updateQuality(-1, -9));
    }

}
