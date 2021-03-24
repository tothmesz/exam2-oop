package com.codecool.farm.animal;

public class Pig extends Animal {
    private static final String name = "pig";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void feed() {
        this.size += 1;
    }
}
