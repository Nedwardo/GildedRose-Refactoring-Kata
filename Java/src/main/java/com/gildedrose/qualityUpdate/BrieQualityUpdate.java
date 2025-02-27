package com.gildedrose.qualityUpdate;

import com.gildedrose.itemUpdate.QualityUpdate;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BrieQualityUpdate implements QualityUpdate {
    @Override
    public int updateQuality (int sellIn, int quality){
        return quality + ((sellIn <= 0) ? 2 : 1);
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("Aged Brie");
    }
}
