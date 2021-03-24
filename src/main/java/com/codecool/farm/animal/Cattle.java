package com.codecool.farm.animal;

public class Cattle extends Animal {
    private static final String name = "cattle";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void feed() {
        this.size += 2;
    }

}
