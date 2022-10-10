package com.gildedrose.itemUpdate;
public class SellByUpdates implements SellByUpdate {
    @Override
    public int updateSellIn(int sellIn){
        return sellIn - 1;
    }
}
