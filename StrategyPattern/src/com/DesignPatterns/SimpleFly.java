package com.DesignPatterns;

import com.DesignPatterns.DuckInterfaces.IFlyStrategy;

public class SimpleFly implements IFlyStrategy {

    @Override
    public void fly() {
        System.out.println("I'm a simple Flying Duck");
    }
}
