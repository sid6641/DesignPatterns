package com.DesignPatterns;

import com.DesignPatterns.DuckInterfaces.IDisplayStrategy;
import com.DesignPatterns.DuckInterfaces.IFlyStrategy;
import com.DesignPatterns.DuckInterfaces.IQuackStrategy;

public class Duck {
    private IFlyStrategy flyStrategy;
    private IQuackStrategy quackStrategy;
    private IDisplayStrategy displayStrategy;

    Duck(IFlyStrategy _flyStrategy, IQuackStrategy _quackStrategy, IDisplayStrategy _displayStrategy) {
        flyStrategy = _flyStrategy;
        quackStrategy = _quackStrategy;
        displayStrategy = _displayStrategy;
    }

    public void fly() {
        flyStrategy.fly();
    }

    public void quack() {
        quackStrategy.quack();
    }

    public void display() {
        displayStrategy.display();
    }
}
