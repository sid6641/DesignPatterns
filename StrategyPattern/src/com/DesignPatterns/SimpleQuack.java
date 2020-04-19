package com.DesignPatterns;

import com.DesignPatterns.DuckInterfaces.IQuackStrategy;

public class SimpleQuack implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("I do simple Quacks");
    }
}
