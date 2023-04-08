package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GorodTest {

    Gorod garden =new Gorod(2,3);

    @Test
    void testHasOrchard() {
        assertEquals(garden.hasOrchard(), true);
    }

    @Test
    void testHasVegetableGarden() {
        assertEquals(garden.hasVegetableGarden(), false);
    }

    @Test
    void testGetInt() {
        assertEquals(garden.getInt(), 2);
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