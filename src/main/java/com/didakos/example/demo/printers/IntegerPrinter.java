package com.didakos.example.demo.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didakos.example.demo.printers.impl.Formatter;

@Service
public class IntegerPrinter implements Printer<Integer> {

    private Formatter<Integer> formatter;

    @Autowired
    public IntegerPrinter(Formatter<Integer> formatter) {
        this.formatter = formatter;
    }

    @Override
    public void print(Integer integer) {
        System.out.println(formatter.format(integer));
    }
}
