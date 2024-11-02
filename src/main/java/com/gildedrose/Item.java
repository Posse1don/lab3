package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    static void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    static void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}