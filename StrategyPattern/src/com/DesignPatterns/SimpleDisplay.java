package com.DesignPatterns;

import com.DesignPatterns.DuckInterfaces.IDisplayStrategy;

public class SimpleDisplay implements IDisplayStrategy {

    @Override
    public void display() {
        System.out.println("This is the simple display");
    }
}
