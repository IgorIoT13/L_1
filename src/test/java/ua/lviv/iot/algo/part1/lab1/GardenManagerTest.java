package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GardenManagerTest {

    GardenManager manager = new GardenManager();
    @Test
    void add() {
        manager.add(new WorkUniversytiGarden(2,4,5));
        manager.add(new BotanicGarden(2,4,5));

        List<Garden> list = new ArrayList<Garden>();
        list.add(new WorkUniversytiGarden(2,4,5));
        list.add(new BotanicGarden(2,4,5));

        String strManager, strList;
        strManager = manager.getGardens().toString();
        strList = list.toString();

        assertEquals(strManager, strList);
    }

    @Test
    void findSculpture() {
        List<Garden> gardens = new ArrayList<Garden>();
        gardens.add(new WorkUniversytiGarden(2,4,5));
        List<Garden> result = new ArrayList<>();
        for (Garden garden : gardens) {
            if (garden instanceof WorkUniversytiGarden && garden.getInt() < 5) {
                result.add(garden);
            }
        }
        List<Garden> findWork = manager.findSculpture(5);
        assertEquals(findWork, result);

    }

    @Test
    void findGreenhouses() {
        List<Garden> gardens = new ArrayList<Garden>();
        gardens.add(new BotanicGarden(2,4,5));
        List<Garden> result = new ArrayList<>();
        for (Garden garden : gardens) {
            if (garden instanceof WorkUniversytiGarden && garden.getInt() > 5) {
                result.add(garden);
            }
        }
        List<Garden> findWork = manager.findGreenhouses(5);
        assertEquals(findWork, result);
    }

    @Test
    void getGardens() {
        manager.add(new BotanicGarden(2,4,5));

        List<Garden> list = new ArrayList<Garden>();
        list.add(new BotanicGarden(2,4,5));

        String strManager, strList;
        strManager = manager.getGardens().toString();

        strList = list.toString();

        assertEquals(strManager, strList);
    }

    @Test
    void setGardens() {
        GardenManager managerList = new GardenManager();
        GardenManager managerSet = new GardenManager();

        List<Garden> list = new ArrayList<Garden>();
        list.add(new BotanicGarden(2,4,5));

        managerList.setGardens(list);

        managerSet.add(new BotanicGarden(2,4,5));


    }
}