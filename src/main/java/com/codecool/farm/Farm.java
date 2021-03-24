package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals(){
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        for (int i = 0; i < animals.size(); i++) {
            if (butcher.canButcher(animals.get(i))) {
                animals.remove(i);
            }
        }
    }

    public boolean isEmpty() {
        if ((animals != null) && (animals.isEmpty())){
            return true;
        }
        return false;
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Animal animal : animals) {
            status.add("There is a " + animal.getSize() + " sized " + animal.getName() + " in the farm.");
        }
        return status;
    }
}
