package com.company.Consumers.CarnivoreConsumersPackage;

import com.company.Consumers.Consumers;

public abstract class CarnivoreConsumers extends Consumers {
    private int weight;
    private int lifespan;
    private String gender;

    public CarnivoreConsumers(int weight, int lifespan, String gender) {
        this.weight = weight;
        this.lifespan = lifespan;
        this.gender = gender;
    }

    @Override
    public void canEat() {
        System.out.println("I  eat meat");
    }




}

