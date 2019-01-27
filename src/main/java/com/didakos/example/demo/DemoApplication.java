package com.didakos.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.didakos.example.demo.printers.PrinterService;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        PrinterService printerService = (PrinterService) context.getBean("printerService");

        printerService.print();
    }

}

