package com.gildedrose;

public class SellByDoesNotUpdate implements SellByUpdate {
    @Override
    public int updateSellIn(int sellIn){
        return sellIn;
    }
}
