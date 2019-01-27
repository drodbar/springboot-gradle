package com.didakos.example.demo.printers.impl;

import org.springframework.stereotype.Component;

@Component
public class FormatterString implements Formatter<String> {
    private static final String FORMAT = "String printer -> [%s]";

    @Override
    public String format(String s) {
        return String.format(FORMAT, s);
    }
}
