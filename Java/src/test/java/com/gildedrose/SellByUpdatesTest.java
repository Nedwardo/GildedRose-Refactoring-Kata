package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellByUpdatesTest {
    @Test
    public void testUpdateSellIn(){
        SellByUpdates sellByUpdates = new SellByUpdates();
        assertEquals(9, sellByUpdates.updateSellIn(10));
        assertEquals(-1, sellByUpdates.updateSellIn(0));
        assertEquals(98, sellByUpdates.updateSellIn(99));
    }

}
