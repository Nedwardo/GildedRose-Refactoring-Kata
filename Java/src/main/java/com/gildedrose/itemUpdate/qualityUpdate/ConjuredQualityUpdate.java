package com.gildedrose.itemUpdate.qualityUpdate;

import com.gildedrose.itemUpdate.QualityUpdate;

public class ConjuredQualityUpdate implements QualityUpdate {
    @Override
    public int updateQuality(int sellIn, int quality) {
        return quality - ((sellIn < 0) ? 4 : 2);
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("Conjured");
    }
}
