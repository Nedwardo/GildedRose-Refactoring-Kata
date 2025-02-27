package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {
    @Test
    public void ValidateThirtyDayBehaviour() {
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 30;
        Scanner myReader = openTestFile();
        assertEquals(myReader.nextLine(), "OMGHAI!");
        for (int i = 0; i < days; i++) {
            assertEquals(myReader.nextLine(), "-------- day " + i + " --------");
            assertEquals(myReader.nextLine(), "name, sellIn, quality");
            for (Item item : items) {
                assertEquals(myReader.nextLine(), item.toString());
            }
            assertEquals(myReader.nextLine(), "");
            app.updateQuality();
        }
    }
    private static Scanner openTestFile() {
        try {
            File myObj = new File("C:\\BJSSAcademy\\GildedRose-Refactoring-Kata\\texttests\\ThirtyDays\\stdout.gr");
            return new Scanner(myObj);
        } catch(FileNotFoundException e){
            fail();
        }
        return new Scanner("");
    }
}
