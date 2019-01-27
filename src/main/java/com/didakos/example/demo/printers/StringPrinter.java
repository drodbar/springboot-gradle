package com.didakos.example.demo.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didakos.example.demo.printers.impl.Formatter;

@Service
public class StringPrinter implements Printer<String> {

    private Formatter<String> formatter;

    @Autowired
    public StringPrinter(Formatter<String> formatter) {
        this.formatter = formatter;
    }

    @Override
    public void print(String t) {
        System.out.println(formatter.format(t));
    }
}
