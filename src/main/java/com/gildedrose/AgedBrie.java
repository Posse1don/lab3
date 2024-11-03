package com.gildedrose;

public class AgedBrie extends Item{
    public AgedBrie(String name, int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.increaseQuality();
        sellIn -= 1;
        if (sellIn < 0) {
            this.increaseQuality();
        }
    }
}
