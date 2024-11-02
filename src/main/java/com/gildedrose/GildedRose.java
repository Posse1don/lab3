package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")
                || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality < 50) {
                        Item.increaseQuality(item);

                        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                            if (item.sellIn < 11) {
                                    Item.increaseQuality(item);
                            }

                            if (item.sellIn < 6) {
                                    Item.increaseQuality(item);
                            }
                        }
                    }
                } else {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        Item.decreaseQuality(item);
                    }
                }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn -= 1;
            }

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                        Item.increaseQuality(item);
                } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        item.quality = 0;
                } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    Item.decreaseQuality(item);
                }
            }
        }
    }

}