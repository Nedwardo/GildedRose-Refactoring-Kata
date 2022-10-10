package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityChangeStub implements QualityChange{
    int qualityModifier;
    int sellInModifier;
    public QualityChangeStub(){
        this.qualityModifier = 0;
        this.sellInModifier =  0;
    }
    public QualityChangeStub(int sellInModifier, int qualityModifier){
        this.qualityModifier = qualityModifier;
        this.sellInModifier =  sellInModifier;
    }
    @Override
    public int updateQuality (int sellIn, int quality){
        return quality + qualityModifier;
    }
    @Override
    public int updateSellIn(int sellIn){
        return sellIn + sellInModifier;
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){ return false;}
}
// TODO ask if should stub item class
class GildedRoseItemTest {

    @Test
    void updateQuality() {
        Item testItem = new Item ("Test Item", 90, 30);
        GildedRoseItem testGildedRoseItem = new GildedRoseItem(testItem, new QualityChangeStub(-2, -1));
        testGildedRoseItem.updateQuality();
        assertTrue(testGildedRoseItem.toString().contains("88"));
        assertTrue(testGildedRoseItem.toString().contains("29"));

        testItem = new Item ("Test Item", 20, 100);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityChangeStub(-20, 100));
        testGildedRoseItem.updateQuality();
        assertTrue(testGildedRoseItem.toString().contains("0"));
        assertTrue(testGildedRoseItem.toString().contains("200"));

        testItem = new Item ("Test Item", -1, -2);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityChangeStub(-5, -9));
        testGildedRoseItem.updateQuality();
        assertTrue(testGildedRoseItem.toString().contains("-6"));
        assertTrue(testGildedRoseItem.toString().contains("-11"));
    }

    @Test
    void testToString() {
        Item testItem = new Item ("Test Item", 90, 30);
        GildedRoseItem testGildedRoseItem = new GildedRoseItem(testItem, new QualityChangeStub());
        assertEquals("Test Item, 90, 30", testGildedRoseItem.toString());

        testItem = new Item ("Apple", 45, 20);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityChangeStub());
        assertEquals("Apple, 45, 20", testGildedRoseItem.toString());

        testItem = new Item ("Giraffe", -9, 0);
        testGildedRoseItem = new GildedRoseItem(testItem, new QualityChangeStub());
        assertEquals("Giraffe, -9, 0", testGildedRoseItem.toString());
    }
}
