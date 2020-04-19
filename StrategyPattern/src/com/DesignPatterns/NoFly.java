package com.DesignPatterns;

import com.DesignPatterns.DuckInterfaces.IFlyStrategy;

public class NoFly implements IFlyStrategy {

    @Override
    public void fly() {
        System.out.println("I do not Fly");
    }
}
