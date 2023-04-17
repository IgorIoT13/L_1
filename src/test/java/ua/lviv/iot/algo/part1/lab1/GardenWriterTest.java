package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class GardenWriterTest {
    private GardenManager manager = new GardenManager();
    private GardenWriter writer = new GardenWriter();

    @BeforeEach
    void setUp() {
        manager.add(new WorkUniversytiGarden(2,2,3));
        manager.add(new WorkUniversytiGarden(6,1,4));
        manager.add(new WorkUniversytiGarden(10,0,7));
        manager.add(new WorkUniversytiGarden(4,2,1));
        manager.add(new WorkUniversytiGarden(14,7,6));
    }


    @Test
    void writeToFile() throws IOException {
        writer.writeToFile(manager.getGardens());
        List<String> expectedLines = Files.readAllLines(Paths.get("Garden.csv"));
        List<String> actualLines = Files.readAllLines(Paths.get("TestCSV.csv"));
        assertEquals(expectedLines, actualLines);
    }
    void EmptyFile() throws IOException {
        writer.writeToFile(manager.getGardens());
        List<String> expectedLines = Files.readAllLines(Paths.get("Garden.csv"));
        List<String> actualLines = Files.readAllLines(Paths.get("TestCSV.csv"));
        assertEquals(expectedLines, actualLines);
    }
}