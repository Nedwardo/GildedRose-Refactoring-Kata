package com.gildedrose.itemUpdate;

import com.gildedrose.Item;
import com.gildedrose.qualityUpdate.DefaultQualityUpdate;

public class ItemUpdate {
    private final SellByUpdate sellByUpdate;
    private final QualityUpdate qualityUpdate;
    private final Boolean bounded;
    public ItemUpdate(){
        this.sellByUpdate = new SellByUpdates();
        this.qualityUpdate = new DefaultQualityUpdate();
        this.bounded = false;
    }
    public ItemUpdate(SellByUpdate sellByUpdate, QualityUpdate qualityUpdate){
        this.sellByUpdate = sellByUpdate;
        this.qualityUpdate = qualityUpdate;
        bounded = true;
    }
    public ItemUpdate(SellByUpdate sellByUpdate, QualityUpdate qualityUpdate, Boolean bounded){
        this.sellByUpdate = sellByUpdate;
        this.qualityUpdate = qualityUpdate;
        this.bounded = bounded;
    }
    public void updateItem(Item item){
        item.quality = qualityUpdate.updateQuality(item.sellIn, item.quality);
        if (bounded)
            item.quality = Math.max(0, Math.min(50, item.quality));
        item.sellIn = sellByUpdate.updateSellIn(item.sellIn);
    }
    public Boolean nameMatchesThisType(String itemName){
        return qualityUpdate.nameMatchesThisType(itemName);
    }
}
