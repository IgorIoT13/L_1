package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.Garden;

public class Clumba extends Garden {

    public Clumba(int area, int numberOfFlowers) {
        super(area, numberOfFlowers);
    }

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
    @Override
    public String ToString(){
        return super.ToString();
    }
}
