package com.gildedrose;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BrieQualityChange implements QualityChange{
    @Override
    public int updateQuality (int sellIn, int quality){
        int updatedQuality = quality + ((sellIn <= 0) ? 2 : 1);
        updatedQuality = max(updatedQuality, 0);
        updatedQuality = min(updatedQuality, 50);
        return updatedQuality;
    }
    @Override
    public int updateSellIn(int sellIn){
        return sellIn - 1;
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("Aged Brie");
    }
}
