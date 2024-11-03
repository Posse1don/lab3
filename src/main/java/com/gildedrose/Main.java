package com.gildedrose;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new AgedBrie(2, 0),
                new BackstagePass(15, 20),
                new Sulfuras(0, 80),
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
