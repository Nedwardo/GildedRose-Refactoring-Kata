package com.gildedrose;

public class GildedRoseItems {
    Item item;
    QualityChange qualityChange;
    public GildedRoseItems(String name, int sellIn, int quality, QualityChange qualityChange) {
        item = new Item (name, sellIn, quality);
        this.qualityChange = qualityChange;
    }

    public void updateQuality(){
        item.quality = qualityChange.updateQuality(item.quality);
    }

    @Override
    public String toString() {
        return item.name + ", " + item.sellIn + ", " + item.quality;
    }
}
