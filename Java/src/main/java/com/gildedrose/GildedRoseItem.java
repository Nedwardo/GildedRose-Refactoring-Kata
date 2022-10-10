package com.gildedrose;

public class GildedRoseItem {
    private final Item item;
    private final ItemUpdate itemUpdate;
    public GildedRoseItem(Item item, QualityUpdate qualityUpdate) {
        this.item = item;
        this.itemUpdate = new ItemUpdate(new SellByUpdates(), qualityUpdate);
    }
    public GildedRoseItem(Item item, ItemUpdate itemUpdate) {
        this.item = item;
        this.itemUpdate = itemUpdate;
    }
    public void updateQuality(){
        itemUpdate.updateItem(item);
    }
    @Override
    public String toString() {
        return item.toString();
    }
}
