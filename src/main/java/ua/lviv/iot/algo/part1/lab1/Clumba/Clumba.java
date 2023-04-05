package ua.lviv.iot.algo.part1.lab1.Clumba;

import ua.lviv.iot.algo.part1.lab1.Garden;

public class Clumba extends Garden {
    @Override
    public boolean hasOrchard() {
        return false;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    @Override
    public int getInt() {
        return numberOfFlowers;
    }
}
