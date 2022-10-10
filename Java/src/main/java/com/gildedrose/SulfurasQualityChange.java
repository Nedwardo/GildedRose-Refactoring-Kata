package com.gildedrose;

public class SulfurasQualityChange implements QualityChange{
    @Override
    public int updateQuality (int sellIn, int quality){
        return 80;
    }
    @Override
    public int updateSellIn(int sellIn){
        return sellIn;
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){
        return itemName.equals("Sulfuras, Hand of Ragnaros");
    }
}
