package com.gildedrose.itemUpdate.qualityUpdate;

import com.gildedrose.itemUpdate.QualityUpdate;

public class DefaultQualityUpdate implements QualityUpdate {
    @Override
    public int updateQuality(int sellIn, int quality) {
        return quality - ((sellIn <= 0) ? 2 : 1);
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){
        return true;
    }
}
