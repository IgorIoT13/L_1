package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClumbaTest {
    Clumba garden =new Clumba(2,3);

    @Test
    void testHasOrchard() {
        assertEquals(garden.hasOrchard(), false);
    }

    @Test
    void testHasVegetableGarden() {
        assertEquals(garden.hasVegetableGarden(), false);
    }

    @Test
    void testGetInt() {
        assertEquals(garden.getInt(), 3);
    }

    @Test
    void testToString() {

        String returner, tostr, meseg;
        returner= garden.myToString();
        tostr = "area -"+ 2 + " numberOfFlowers" + 3;
        meseg="ToString working uncorect";
        assertEquals(returner , tostr, meseg);
    }
}