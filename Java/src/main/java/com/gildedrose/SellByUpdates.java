package com.gildedrose;

public class SellByUpdates implements SellByUpdate {
    @Override
    public int updateSellIn(int sellIn){
        return sellIn - 1;
    }
}
