package com.example.laba1.service;

import com.example.laba1.parametrs.Max;
import com.example.laba1.threads.FileReadRunner;
import com.example.laba1.threads.FileWriteRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class SortDatabaseService {
    public void sortDatabase(String path) {
        try {
            ArrayList<Max> list = new ArrayList<>();
            Thread FileReadThread = new Thread(new FileReadRunner(path, list));
            FileReadThread.start();
            FileReadThread.join();
            Collections.sort(list);
            Thread FileWriteThread = new Thread(new FileWriteRunner(path, list));
            FileWriteThread.start();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
