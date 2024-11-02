package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    Item.increaseQuality(item);
                    item.sellIn -= 1;
                    if (item.sellIn < 0) {
                        Item.increaseQuality(item);
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    Item.increaseQuality(item);
                    if (item.sellIn < 11) {
                        Item.increaseQuality(item);
                    }
                    if (item.sellIn < 6) {
                        Item.increaseQuality(item);
                    }
                    item.sellIn -= 1;
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    item.updateQuality();
                    break;
            }
        }
    }
}