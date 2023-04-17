package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkUniversytiGardenTest {
    private WorkUniversytiGarden garden =new WorkUniversytiGarden(2,3,4);

    @Test
    void getCountGreenhouses() {
        assertEquals(garden.getCountSculptures(), 4);
    }

    @Test
    void setCountGreenhouses() {
        garden.setCountSculptures(5);
        assertEquals(garden.getCountSculptures(), 5);
    }
}