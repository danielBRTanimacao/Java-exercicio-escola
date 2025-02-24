package com.daniel.packages;

import java.util.Random;

public abstract class Person {
    protected String id;
    protected String name;

    public Person(String name) {
        this.id = randomIdGenerator();
        this.name = name;
    }

    private String randomIdGenerator() {
        Random rand = new Random();
        
        char firstLetter = (char) ('A' + rand.nextInt(26));
        char secondLetter = (char) ('A' + rand.nextInt(26));

        int num = rand.nextInt(1000);

        return String.format("%c%c%03d", firstLetter, secondLetter, num);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public abstract void displayInfo();
}
