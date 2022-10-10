package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityUpdateStub implements QualityUpdate {
    int qualityModifier;
    public QualityUpdateStub(){
        this.qualityModifier = 0;
    }
    public QualityUpdateStub(int qualityModifier){
        this.qualityModifier = qualityModifier;
    }
    @Override
    public int updateQuality (int sellIn, int quality){
        return quality + qualityModifier;
    }

    @Override
    public Boolean nameMatchesThisType(String itemName){ return false;}
}
// TODO ask if should stub item class
class GildedRoseItemTest {

    @Test
    void updateQuality() {
        Item testItem = new Item ("Test Item", 90, 30);
        GildedRoseItem testGildedRoseItem = new GildedRoseItem(testItem, new QualityUpdateStub(-1));
        testGildedRoseItem.updateQuality();
        assertTrue(testGildedRoseItem.toString().contains("29"));

        testItem = new Item ("Test Item", 20, 100);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityUpdateStub(100));
        testGildedRoseItem.updateQuality();
        assertTrue(testGildedRoseItem.toString().contains("50"));

        testItem = new Item ("Test Item", -1, -2);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityUpdateStub(-9));
        testGildedRoseItem.updateQuality();
        assertTrue(testGildedRoseItem.toString().contains("0"));
    }

    @Test
    void testToString() {
        Item testItem = new Item ("Test Item", 90, 30);
        GildedRoseItem testGildedRoseItem = new GildedRoseItem(testItem, new QualityUpdateStub());
        assertEquals("Test Item, 90, 30", testGildedRoseItem.toString());

        testItem = new Item ("Apple", 45, 20);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityUpdateStub());
        assertEquals("Apple, 45, 20", testGildedRoseItem.toString());

        testItem = new Item ("Giraffe", -9, 0);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityUpdateStub());
        assertEquals("Giraffe, -9, 0", testGildedRoseItem.toString());
    }
}
