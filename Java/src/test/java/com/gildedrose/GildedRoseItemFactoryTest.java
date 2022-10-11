package com.gildedrose;

import com.gildedrose.itemUpdate.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestQualityUpdate1 implements QualityUpdate {
    public int updateQuality (int sellIn, int quality){return 1;}
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("A");
    }
}
class TestQualityUpdate2 implements QualityUpdate {
    public int updateQuality (int sellIn, int quality){return 2;}
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("B");
    }
}
class TestQualityUpdate3 implements QualityUpdate {
    public int updateQuality (int sellIn, int quality){return 3;}
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("C");
    }
}
class GildedRoseItemFactoryTest {

    @Test
    void createInstance() {
        ItemUpdate[] itemUpdates = new ItemUpdate[]{
            new ItemUpdate(new SellByUpdates(), new TestQualityUpdate1()),
            new ItemUpdate(new SellByUpdates(), new TestQualityUpdate2()),
            new ItemUpdate(new SellByUpdates(), new TestQualityUpdate3())
        };
        GildedRoseItemFactory gildedRoseItemFactory = new GildedRoseItemFactory(itemUpdates);
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
