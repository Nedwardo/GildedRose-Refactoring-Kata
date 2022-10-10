package com.gildedrose;

import static java.lang.Math.max;
import static java.lang.Math.min;

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
