package ua.lviv.iot.algo.part1.lab1.Manager.GardenManager;

import ua.lviv.iot.algo.part1.lab1.Manager.addGardenManager;
import ua.lviv.iot.algo.part1.lab1.BotanicGarden.BotanicGarden;
import ua.lviv.iot.algo.part1.lab1.Garden;
import ua.lviv.iot.algo.part1.lab1.UniversityGarden.UniversityGarden;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class GardenManager extends addGardenManager {
    private List<Garden> gardens = new ArrayList<Garden>();
    @Override
    public void addobject(Garden garden) {
        gardens.add(garden);
    }

    public List<Garden> find_sculpture(int sculpture){
        return gardens.stream().filter(garden -> garden instanceof UniversityGarden && garden.get_int() < sculpture ).collect(Collectors.toList());
    }
    public List<Garden> find_Greenhouses(int greenhouses){
        return gardens.stream().filter(garden -> garden instanceof BotanicGarden && garden.get_int() > greenhouses ).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        GardenManager manager = new GardenManager();
        manager.addobject(new UniversityGarden(2));
        manager.addobject(new UniversityGarden(1));
        manager.addobject(new BotanicGarden(5));
        manager.addobject(new BotanicGarden(1));

        List<Garden> gardensWithSculptures = manager.find_sculpture(3);
        System.out.println(gardensWithSculptures);

        List<Garden> gardensWithGreenhouses = manager.find_Greenhouses(2);
        System.out.println(gardensWithGreenhouses);
    }
}

