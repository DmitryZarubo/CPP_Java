package com.example.laba1.service;

import com.example.laba1.parametrs.Max;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class FileWorkerService {
    public void write(String path, ArrayList<Max> list) {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (Max el : list) {
                writer.write(el.getNumb1() + " " + el.getNumb2() + " " + el.getNumb3() + " " + el.getValue() + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void write(String path, Max max) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(max.getNumb1() + " " + max.getNumb2() + " " + max.getNumb3() + " " + max.getValue() + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String read(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String buffer;
            String[] array = new String[4];
            BufferedReader reader = new BufferedReader(new FileReader(path));
            for (int i = 1; (buffer = reader.readLine()) != null; i++) {
                array = buffer.split(" ");
                stringBuilder.append("(" + i + ")Numb1: " + array[0] + ", Numb2: " + array[1] + ", Numb3: " + array[2] + ", Val: " + array[3] + ";");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public void read(String path, ArrayList<Max> list) {
        try {
            String buffer;
            String[] array = new String[4];
            BufferedReader reader = new BufferedReader(new FileReader((path)));
            while ((buffer = reader.readLine()) != null) {
                array = buffer.split(" ");
                int numb1 = Integer.parseInt(array[0]);
                int numb2 = Integer.parseInt(array[1]);
                int numb3 = Integer.parseInt(array[2]);
                int maxnumb = Integer.parseInt(array[3]);
                list.add(new Max(numb1, numb2, numb3, maxnumb));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}