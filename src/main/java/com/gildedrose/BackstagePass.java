package com.gildedrose;

public class BackstagePass extends Item{
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }
        if (sellIn < 6) {
            increaseQuality();
        }
        sellIn -= 1;
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
