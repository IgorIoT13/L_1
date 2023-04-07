package ua.lviv.iot.algo.part1.lab1.UniversityGarden;

import ua.lviv.iot.algo.part1.lab1.Garden;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UniversityGarden extends Garden {
    int countSculptures;
    
    @Override
    public int getInt() {
        return countSculptures;
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
