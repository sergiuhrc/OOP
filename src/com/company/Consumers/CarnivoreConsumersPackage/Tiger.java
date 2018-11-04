package com.company.Consumers.CarnivoreConsumersPackage;

public class Tiger extends CarnivoreConsumers {
    int speed;
    String subspecies;


    public Tiger(int weight, int lifespan, String gender,int speed, String subspecies) {
        super(weight, lifespan, gender);
        this.speed = speed;
        this.subspecies = subspecies;
    }
}
