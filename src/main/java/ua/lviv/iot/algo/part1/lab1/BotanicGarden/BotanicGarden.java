package ua.lviv.iot.algo.part1.lab1.BotanicGarden;

import ua.lviv.iot.algo.part1.lab1.Garden;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BotanicGarden extends Garden {
    int countGreenhouses ;
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
}
