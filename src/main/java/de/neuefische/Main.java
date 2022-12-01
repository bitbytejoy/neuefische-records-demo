package de.neuefische;

import de.neuefische.records.CatRecord;

public class Main {
    public static void main(String[] args) {
        CatRecord cat = new CatRecord("Miawi", 2);
        cat.hello();
        cat = new CatRecord(cat.name(), 3);
        System.out.println(cat);
    }
}