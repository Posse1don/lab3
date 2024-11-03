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
                    item.increaseQuality();
                    item.sellIn -= 1;
                    if (item.sellIn < 0) {
                        item.increaseQuality();
                    }
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
                    item.increaseQuality();
                    if (item.sellIn < 11) {
                        item.increaseQuality();
                    }
                    if (item.sellIn < 6) {
                        item.increaseQuality();
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