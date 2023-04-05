package ua.lviv.iot.algo.part1.lab1.Gorod;

import ua.lviv.iot.algo.part1.lab1.Garden;

public class Gorod extends Garden {
    @Override
    public boolean hasOrchard() {
        return true;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    @Override
    public int getInt() {
        return area;
    }
}
