package com.didakos.example.demo.printers.impl;

import org.springframework.stereotype.Component;

@Component
public class FormatterInteger implements Formatter<Integer> {
    private static final String FORMAT = "Integer printer -> [%d]";

    @Override
    public String format(Integer i) {
        return String.format(FORMAT, i);
    }
}
