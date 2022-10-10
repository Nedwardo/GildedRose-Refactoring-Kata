package com.gildedrose;

import com.gildedrose.itemUpdate.SellByDoesNotUpdate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellByDoesNotUpdateTest {

    @Test
    void updateSellIn() {
        SellByDoesNotUpdate sellByDoesNotUpdate = new SellByDoesNotUpdate();
        assertEquals(10, sellByDoesNotUpdate.updateSellIn(10));
        assertEquals(0, sellByDoesNotUpdate.updateSellIn(0));
        assertEquals(-1, sellByDoesNotUpdate.updateSellIn(-1));
        assertEquals(99, sellByDoesNotUpdate.updateSellIn(99));
    }
}
