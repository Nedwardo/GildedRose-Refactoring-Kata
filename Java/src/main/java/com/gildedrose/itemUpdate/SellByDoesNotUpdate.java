package com.gildedrose.itemUpdate;
public class SellByDoesNotUpdate implements SellByUpdate {
    @Override
    public int updateSellIn(int sellIn){
        return sellIn;
    }
}
