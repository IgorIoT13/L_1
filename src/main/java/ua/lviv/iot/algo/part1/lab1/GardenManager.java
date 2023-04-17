package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter


public class GardenManager {
    /**
     * List element garden.
     */
    private List<Garden> gardens = new ArrayList<Garden>();

    /**
     * add new element to list.
     * @param garden object class garden
     */
    public void add(final Garden garden) {
        gardens.add(garden);
    }

    /**
     * find all object class WUG who have < sul.
     * @param sculpture countscul
     * @return list
     */
    public List<Garden> findSculpture(final int sculpture) {
        return gardens.stream().filter(
                garden -> garden
                        instanceof WorkUniversytiGarden
                        && garden.getInt() < sculpture)
                .collect(Collectors.toList());
    }

    /**
     * find all object class BG who have > gre.
     * @param greenhouses countOfG-ses
     * @return list
     */
    public List<Garden> findGreenhouses(final int greenhouses) {
        return gardens.stream().filter(
                garden -> garden
                        instanceof BotanicGarden
                        && garden.getInt() > greenhouses)
                .collect(Collectors.toList());
    }
}

