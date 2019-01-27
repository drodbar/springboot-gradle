package com.didakos.example.demo.printers;

import org.springframework.stereotype.Service;

@Service
public interface Printer<T> {

    void print(T t);
}
