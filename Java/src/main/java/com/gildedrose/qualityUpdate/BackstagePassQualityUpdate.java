package com.gildedrose.qualityUpdate;

import com.gildedrose.itemUpdate.QualityUpdate;

public class BackstagePassQualityUpdate implements QualityUpdate {
    @Override
    public int updateQuality(int sellIn, int quality) {
        int updatedQuality = quality;
        if (sellIn > 10)
            updatedQuality += 1;
        else if (sellIn > 5)
            updatedQuality += 2;
        else if (sellIn > 0)
            updatedQuality += 3;
        else
            updatedQuality = 0;
        return updatedQuality;
    }
    @Override
    public Boolean nameMatchesThisType(String itemName){
        return itemName.contains("Backstage passes to a TAFKAL80ETC concert");
    }
}
