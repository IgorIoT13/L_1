package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkUniversytiGardenTest {
    WorkUniversytiGarden garden =new WorkUniversytiGarden(2,3,4);
    @Test
    void hasOrchard() {
        assertEquals(garden.hasOrchard(), false);
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
        assertEquals(garden.getCountSculptures(), 4);
    }

    @Test
    void setCountGreenhouses() {
        garden.setCountSculptures(5);
        assertEquals(garden.getCountSculptures(), 5);
    }

    @Test
    void testToString() {

        String returner, tostr, meseg;
        returner= garden.ToString();
        tostr = "area -" + 2 + " numberOfFlowers" + 3 + " countSculptures " + 4;
        meseg="ToString working uncorect";
        assertEquals (returner , tostr, meseg);
    }
}