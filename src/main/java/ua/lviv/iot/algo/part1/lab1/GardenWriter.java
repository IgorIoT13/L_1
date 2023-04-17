package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class GardenWriter {
    private String writerCSV;
    private File file = new File("Garden.csv");


    public void writeToFile(List<Garden> gardens){

        try {
            if (file.createNewFile()) {
                System.out.println("Файл створився");
            } else {
                System.out.println("Файл вже створенний");
            }

        } catch (IOException e) {
            System.out.println("Проблема: " + e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                FileWriter writer = new FileWriter("Garden.csv");
                boolean Header = false;
                for (Garden garden:gardens) {
                    if(Header==false){
                       writer.write(garden.getHeaders());
                       Header=true;
                    }
                    writer.write(garden.toCSV());

                }
                writer.close();
            }catch (Exception e){
                System.err.println("Помилка:" + e.getMessage());
            }
        }
    }
}
