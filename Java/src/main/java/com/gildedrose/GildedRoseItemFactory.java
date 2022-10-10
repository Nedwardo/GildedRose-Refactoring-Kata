package com.gildedrose;

public class GildedRoseItemFactory {
    QualityChange[] qualityChanges;
    public GildedRoseItemFactory(QualityChange[] qualityChanges){
        this.qualityChanges = qualityChanges;
    }
    public GildedRoseItem CreateInstance(Item item){
        return new GildedRoseItem(item, assignQualityChange(item));
    }
    private QualityChange assignQualityChange(Item item) {
        for (QualityChange qualityChange : qualityChanges){
            if (qualityChange.nameMatchesThisType(item.name))
                return qualityChange;
        }
        return new DefaultQualityChange();
    }
}
