package com.gildedrose;

public class GildedRoseItem {
    private final Item item;
    private final QualityChange qualityChange;
    public GildedRoseItem(Item item, QualityChange qualityChange) {
        this.item = item;
        this.qualityChange = qualityChange;
    }
    public void updateQuality(){
        item.quality = qualityChange.updateQuality(item.sellIn, item.quality);
        item.sellIn = qualityChange.updateSellIn(item.sellIn);
    }
    @Override
    public String toString() {
        return item.name + ", " + item.sellIn + ", " + item.quality;
    }
}
