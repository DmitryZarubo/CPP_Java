package com.example.laba1.service;

import org.springframework.stereotype.Service;

@Service
public class ShowDatabaseService {
    public String showDatabase(String path) {
        String data;
        FileWorkerService fileWorker = new FileWorkerService();
        data = fileWorker.read(path);
        return data;
    }
}
