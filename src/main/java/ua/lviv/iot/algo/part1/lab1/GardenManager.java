package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.Clumba;
import ua.lviv.iot.algo.part1.lab1.Gorod;
import ua.lviv.iot.algo.part1.lab1.BotanicGarden;
import ua.lviv.iot.algo.part1.lab1.Garden;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.*;
import ua.lviv.iot.algo.part1.lab1.WorkUniversytiGarden;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class GardenManager{
    private List<Garden> gardens = new ArrayList<Garden>();

    public void add(Garden garden) {
        gardens.add(garden);
    }

    public List<Garden> findSculpture(int sculpture){
        return gardens.stream().filter(garden -> garden instanceof WorkUniversytiGarden && garden.getInt() < sculpture ).collect(Collectors.toList());
    }
    public List<Garden> findGreenhouses(int greenhouses){
        return gardens.stream().filter(garden -> garden instanceof BotanicGarden && garden.getInt() > greenhouses ).collect(Collectors.toList());
    }
}

