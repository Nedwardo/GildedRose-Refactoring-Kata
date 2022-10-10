package com.gildedrose;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BackstagePassQualityChange implements QualityChange{
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
        return itemName.contains("Backstage passes to a TAFKAL80ETC concert");
    }
}
