package com.example.laba1.controllers;

import com.example.laba1.service.FileWorkerService;
import com.example.laba1.service.ShowDatabaseService;
import com.example.laba1.service.SortDatabaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DatabaseController {
    private static final String DATABASE = "D:\\database.txt";

    @PostMapping("/showDatabase")
    public  String showDatabase(Model model) {
        String data;
        ShowDatabaseService show = new ShowDatabaseService();
        data = show.showDatabase(DATABASE);
        model.addAttribute("database", data);
        return "database";
    }

    @PostMapping("/backDatabase")
    public String returnMain(Model model) { return "max"; }

    @PostMapping("/sortByPosition")
    public String sortByPosition(Model model) {
        SortDatabaseService sort = new SortDatabaseService();
        sort.sortDatabase(DATABASE);
        return "database";
    }
}

