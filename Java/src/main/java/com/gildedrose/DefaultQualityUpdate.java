package com.gildedrose;
import static java.lang.Math.max;
import static java.lang.Math.min;
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
