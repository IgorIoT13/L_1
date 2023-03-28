package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
import ua.lviv.iot.algo.part1.lab1.UniversityGarden.UniversityGarden;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Garden {
    private double area;
    private int numberOfFlowers;
    public abstract boolean hasOrchard();
    public abstract boolean hasVegetableGarden();

    public abstract int get_int() ;

}