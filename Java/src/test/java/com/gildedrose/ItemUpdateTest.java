package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ItemUpdateTest {
    @Test
    void testQualityBoundedBetween0And50() {
        QualityUpdate qualityUpdate = new QualityUpdateStub();
        SellByUpdate sellByUpdate = new SellByDoesNotUpdate();
        ItemUpdate itemUpdateBounded = new ItemUpdate(sellByUpdate, qualityUpdate);
        ItemUpdate itemUpdateUnbounded = new ItemUpdate(sellByUpdate, qualityUpdate, false);

        Item qualityGreaterThan50 = new Item("Greater than 50", 99, 55);
        Item qualityLessThan0 = new Item("Greater than 50", 99, -4);

        itemUpdateUnbounded.updateItem(qualityGreaterThan50);
        itemUpdateUnbounded.updateItem(qualityLessThan0);
        assertEquals(55, qualityGreaterThan50.quality);
        assertEquals(-4, qualityLessThan0.quality);

        itemUpdateBounded.updateItem(qualityGreaterThan50);
        itemUpdateBounded.updateItem(qualityLessThan0);
        assertEquals(50, qualityGreaterThan50.quality);
        assertEquals(0, qualityLessThan0.quality);
    }
}
