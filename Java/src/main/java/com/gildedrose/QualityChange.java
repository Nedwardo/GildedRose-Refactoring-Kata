package com.gildedrose;

public interface QualityChange {
    int updateQuality (int sellIn, int quality);
    int updateSellIn(int sellIn);
    Boolean nameMatchesThisType(String itemName);
}
