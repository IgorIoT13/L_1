package ua.lviv.iot.algo.part1.lab1.UniversityGarden;

import ua.lviv.iot.algo.part1.lab1.Garden;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UniversityGarden extends Garden {
    int Count_sculptures;

    @Override
    public int getInt() {
        return Count_sculptures;
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }


}
