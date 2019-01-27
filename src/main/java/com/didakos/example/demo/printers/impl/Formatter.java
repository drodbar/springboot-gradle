package com.didakos.example.demo.printers.impl;

import org.springframework.stereotype.Component;

@Component
public interface Formatter<T> {
    String format(T t);
}
