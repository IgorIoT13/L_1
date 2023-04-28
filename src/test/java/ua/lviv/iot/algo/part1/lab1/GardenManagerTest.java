package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GardenManagerTest {
    private GardenManager manager = new GardenManager();

    private List<Garden> list = new ArrayList<Garden>();
    @BeforeEach
    public void setUp() {
        manager.add(new WorkUniversytiGarden(3,4,1));
        manager.add(new WorkUniversytiGarden(3,4,3));
        manager.add(new WorkUniversytiGarden(3,4,9));
        manager.add(new WorkUniversytiGarden(3,4,3));
        manager.add(new WorkUniversytiGarden(3,4,5));
        manager.add(new WorkUniversytiGarden(3,4,7));
        manager.add(new BotanicGarden(3,4,1));
        manager.add(new BotanicGarden(3,4,3));
        manager.add(new BotanicGarden(3,4,9));
        manager.add(new BotanicGarden(3,4,3));
        manager.add(new BotanicGarden(3,4,5));
        manager.add(new BotanicGarden(3,4,7));

        list.add(new WorkUniversytiGarden(3,4,1));
        list.add(new WorkUniversytiGarden(3,4,3));
        list.add(new WorkUniversytiGarden(3,4,9));
        list.add(new WorkUniversytiGarden(3,4,3));
        list.add(new WorkUniversytiGarden(3,4,5));
        list.add(new WorkUniversytiGarden(3,4,7));
        list.add(new BotanicGarden(3,4,1));
        list.add(new BotanicGarden(3,4,3));
        list.add(new BotanicGarden(3,4,9));
        list.add(new BotanicGarden(3,4,3));
        list.add(new BotanicGarden(3,4,5));
        list.add(new BotanicGarden(3,4,7));

    }

    @Test
    void testAdd() {
        int current = manager.getGardens().size();

        manager.add(new BotanicGarden(2,2,3));
        assertEquals(current, manager.getGardens().size()-1);

    }



    @Test
    void testFindSculpture() {
        List<Garden> resultList =manager.findSculpture(5);
        assertTrue( resultList.size()== 3);

    }

    @Test
    void testFindGreenhouses() {
        List<Garden> resultList =manager.findGreenhouses(5);
        assertTrue( resultList.size()== 2);
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