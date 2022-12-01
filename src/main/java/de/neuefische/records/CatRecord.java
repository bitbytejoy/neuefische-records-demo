package de.neuefische.records;

public record CatRecord(String name, int age) {
    public void hello () {
        System.out.println("Hello" + name);
    }
}
