package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.Garden;


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
public class WorkUniversytiGarden extends Garden{

    int countSculptures;

    public WorkUniversytiGarden(int area, int numberOfFlowers, int countSculptures) {
        super(area, numberOfFlowers);
        this.countSculptures = countSculptures;
    }

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

    @Override
    public String ToString(){
        return super.ToString() + " countSculptures " + countSculptures;
    }


}
