package de.neuefische.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatClass {
    private String name;
    private int age;

    public void hello () {
        System.out.println("Hello" + name);
    }
}
