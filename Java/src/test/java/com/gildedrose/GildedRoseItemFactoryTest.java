package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestQualityChange1 implements QualityChange{
    public int updateQuality (int sellIn, int quality){return 1;}
    public int updateSellIn(int sellIn){return 0;}
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("A");
    }
}
class TestQualityChange2 implements QualityChange{
    public int updateQuality (int sellIn, int quality){return 2;}
    public int updateSellIn(int sellIn){return 0;}
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("B");
    }
}
class TestQualityChange3 implements QualityChange{
    public int updateQuality (int sellIn, int quality){return 3;}
    public int updateSellIn(int sellIn){return 0;}
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("C");
    }
}
class GildedRoseItemFactoryTest {

    @Test
    void createInstance() {
        QualityChange[] qualityChanges = new QualityChange[]{
            new TestQualityChange1(), new TestQualityChange2(), new TestQualityChange3()
        };
        GildedRoseItemFactory gildedRoseItemFactory = new GildedRoseItemFactory(qualityChanges);
        GildedRoseItem testItem1 = gildedRoseItemFactory.CreateInstance(new Item("A", 0, 0));
        testItem1.updateQuality();
        assertTrue(testItem1.toString().contains("1"));

        GildedRoseItem testItem2 = gildedRoseItemFactory.CreateInstance(new Item("B", 0, 0));
        testItem2.updateQuality();
        assertTrue(testItem2.toString().contains("2"));

        GildedRoseItem testItem3 = gildedRoseItemFactory.CreateInstance(new Item("C", 0, 0));
        testItem3.updateQuality();
        assertTrue(testItem3.toString().contains("3"));
    }
}
