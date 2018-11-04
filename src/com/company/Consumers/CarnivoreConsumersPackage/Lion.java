package com.company.Consumers.CarnivoreConsumersPackage;

public class Lion extends CarnivoreConsumers {
    int speed;


    public Lion(int weight, int lifespan, String gender ,int speed) {
        super(weight, lifespan, gender);
        this.speed = speed;
    }
}
