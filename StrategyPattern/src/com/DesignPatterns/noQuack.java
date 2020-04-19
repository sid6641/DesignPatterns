package com.DesignPatterns;

import com.DesignPatterns.DuckInterfaces.IQuackStrategy;

public class noQuack implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("I don't quack");
    }
}
