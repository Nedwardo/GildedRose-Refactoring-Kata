package com.gildedrose;

import com.gildedrose.itemUpdate.*;
import com.gildedrose.itemUpdate.qualityUpdate.BackstagePassQualityUpdate;
import com.gildedrose.itemUpdate.qualityUpdate.BrieQualityUpdate;
import com.gildedrose.itemUpdate.qualityUpdate.DefaultQualityUpdate;
import com.gildedrose.itemUpdate.qualityUpdate.SulfurasQualityUpdate;

class GildedRose {
    public GildedRoseItem[] items;
    private final ItemUpdate[] itemUpdates = new ItemUpdate[]{
        new ItemUpdate(new SellByUpdates(), new BrieQualityUpdate()),
            new ItemUpdate(new SellByUpdates(), new BackstagePassQualityUpdate()),
            new ItemUpdate(new SellByDoesNotUpdate(), new SulfurasQualityUpdate(), false),
            new ItemUpdate(new SellByUpdates(), new DefaultQualityUpdate())
    };
    public GildedRose(Item[] items) {
        GildedRoseItemFactory itemFactory = new GildedRoseItemFactory(itemUpdates);
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
