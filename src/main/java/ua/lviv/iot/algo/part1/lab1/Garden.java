package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Garden {
    protected int area;
    protected int numberOfFlowers;
    public abstract boolean hasOrchard();
    public abstract boolean hasVegetableGarden();

    public abstract int getInt();

    public String ToString(){
        return "area -" + area + " numberOfFlowers" + numberOfFlowers ;
    }
}
