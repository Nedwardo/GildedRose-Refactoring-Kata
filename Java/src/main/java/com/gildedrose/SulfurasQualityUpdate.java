package com.gildedrose;

public class SulfurasQualityUpdate implements QualityUpdate {
    @Override
    public int updateQuality (int sellIn, int quality){
        return 80;
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){
        return itemName.equals("Sulfuras, Hand of Ragnaros");
    }
}
