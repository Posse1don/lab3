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

    protected void decreaseQuality() {
        if (quality > 0) {
            quality -= 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {quality += 1;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
        this.decreaseQuality();
        sellIn -= 1;
        if (sellIn < 0) {
            this.decreaseQuality();
        }
    }
}