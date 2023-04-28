package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotanicGardenTest {

    BotanicGarden gardenManager =new BotanicGarden(2,3,4);
    @Test
    void getCountGreenhouses() {
        assertEquals(gardenManager.getCountGreenhouses(), 4);
    }

    @Test
    void setCountGreenhouses() {
        gardenManager.setCountGreenhouses(5);
        assertEquals(gardenManager.getCountGreenhouses(), 5);
    }
}