package com.gildedrose.itemUpdate;

import com.gildedrose.Item;
public class GildedRoseItemFactory {
    ItemUpdate[] itemUpdates;
    public GildedRoseItemFactory(ItemUpdate[] itemUpdates){
        this.itemUpdates = itemUpdates;
    }
    public GildedRoseItem CreateInstance(Item item){
        return new GildedRoseItem(item, assignQualityChange(item));
    }
    private ItemUpdate assignQualityChange(Item item) {
        for (ItemUpdate itemUpdate : itemUpdates){
            if (itemUpdate.nameMatchesThisType(item.name))
                return itemUpdate;
        }
        return new ItemUpdate();
    }
}
