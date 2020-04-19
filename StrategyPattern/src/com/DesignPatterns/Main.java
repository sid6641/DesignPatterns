package com.DesignPatterns;

public class Main {

    public static void main(String[] args) {

        Duck simpleDuck = new Duck(new SimpleFly(), new SimpleQuack(), new SimpleDisplay());
        simpleDuck.display();
        simpleDuck.fly();
        simpleDuck.quack();

        System.out.println();

        Duck rubberDuck = new Duck(new NoFly(), new noQuack(), new SimpleDisplay());
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
