package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.Garden;

public class Gorod extends Garden {


    public Gorod(int area, int numberOfFlowers) {
        super(area, numberOfFlowers);
    }

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
    @Override
    public String ToString(){
        return super.ToString();
    }
}
