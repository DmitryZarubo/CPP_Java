package com.example.laba1.controllers;

import com.example.laba1.exceptions.InputException;
import com.example.laba1.parametrs.Max;
import com.example.laba1.service.FileWorkerService;
import com.example.laba1.validator.Validator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class MaxController {

    private static final Logger logger = LogManager.getLogger();
    private static final String DATABASE = "D:\\database.txt";

    @GetMapping("/max")
    public String main(Model model) {
        model.addAttribute("message");
        return "max";
    }

    @PostMapping("/max")
    public String processMain(@RequestParam String inputNumber1, @RequestParam String inputNumber2, @RequestParam String inputNumber3, Model model) {
        Validator validator = new Validator();
        try {
            FileWorkerService fileWorker = new FileWorkerService();
            logger.info("Input1: " + inputNumber1);
            logger.info("Input2: " + inputNumber2);
            logger.info("Input3: " + inputNumber3);
            validator.CheckString(inputNumber1);
            validator.CheckString(inputNumber2);
            validator.CheckString(inputNumber3);
            int numb1 = Integer.parseInt(inputNumber1);
            int numb2 = Integer.parseInt(inputNumber2);
            int numb3 = Integer.parseInt(inputNumber3);
            Max max = new Max(numb1, numb2, numb3);
            model.addAttribute("message", "Максимальное: " + max.getValue());
            fileWorker.write(DATABASE, max);
            logger.info("Result: " + max.getValue());
        }
        catch (InputException ex) {
            logger.error("Exception: " + ex.getMessage());
            model.addAttribute("message", ex.getMessage());
        }
        return "max";
    }
    @PostMapping("/database")
    public String database(Model model) {
        return "database";
    }
}
