package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotanicGardenTest {
    BotanicGarden garden =new BotanicGarden(2,3,4);
    @Test
    void hasOrchard() {
        assertEquals(garden.hasOrchard(), true);
    }

    @Test
    void hasVegetableGarden() {
        assertEquals(garden.hasVegetableGarden(), false);
    }

    @Test
    void getInt() {
        assertEquals(garden.getInt(), 4);
    }
    @Test
    void getCountGreenhouses() {
        assertEquals(garden.getCountGreenhouses(), 4);
    }

    @Test
    void setCountGreenhouses() {
        garden.setCountGreenhouses(5);
        assertEquals(garden.getCountGreenhouses(), 5);
    }

    @Test
    void testToString() {

        String returner, tostr, meseg;
        returner= garden.myToString();
        tostr = "area -" + 2 + " numberOfFlowers" + 3 + " countGreenhouses " + 4;;
        meseg="ToString working uncorect";
        assertEquals (returner , tostr, meseg);
    }
}