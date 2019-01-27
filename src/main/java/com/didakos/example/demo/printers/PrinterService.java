package com.didakos.example.demo.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrinterService {

    @Autowired
    private IntegerPrinter integerPrinter;

    @Autowired
    private StringPrinter stringPrinter;

    public void print() {
        integerPrinter.print(1);

        stringPrinter.print("Hello World!");
    }

}
