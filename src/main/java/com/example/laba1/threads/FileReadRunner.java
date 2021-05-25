package com.example.laba1.threads;

import com.example.laba1.parametrs.Max;
import com.example.laba1.service.FileWorkerService;

import java.util.ArrayList;

public class FileReadRunner implements Runnable {
    private String path;
    private ArrayList<Max> list;

    public FileReadRunner(String path, ArrayList<Max> list) {
        this.path = path;
        this.list = list;
    }

    @Override
    public void run() {
        FileWorkerService fileWorker = new FileWorkerService();
        fileWorker.read(path, list);
    }
}
