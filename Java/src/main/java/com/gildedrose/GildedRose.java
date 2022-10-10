package com.gildedrose;

class GildedRose {
    GildedRoseItem[] items;
    GildedRoseItemFactory itemFactory;
    QualityChange[] qualityChanges = new QualityChange[]{
        new BrieQualityChange(),
        new BackstagePassQualityChange(),
        new SulfurasQualityChange(),
        new DefaultQualityChange()
    };
    public GildedRose(Item[] items) {
        itemFactory = new GildedRoseItemFactory(qualityChanges);
        this.items = new GildedRoseItem[items.length];
        for (int itemIndex = 0; itemIndex < items.length; itemIndex++){
            this.items[itemIndex] = itemFactory.CreateInstance(items[itemIndex]);
        }
    }
    public void updateQuality() {
        for (GildedRoseItem item : items) {
            item.updateQuality();
        }
    }
}
