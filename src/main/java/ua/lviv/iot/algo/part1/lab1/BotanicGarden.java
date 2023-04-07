package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.Garden;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BotanicGarden extends Garden {
    int countGreenhouses ;

    public BotanicGarden(int area, int numberOfFlowers, int countGreenhouses) {
        super(area, numberOfFlowers);
        this.countGreenhouses = countGreenhouses;
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
        return countGreenhouses;
    }

    @Override
    public String ToString(){
        return super.ToString() + " countGreenhouses " + countGreenhouses;
    }
}
