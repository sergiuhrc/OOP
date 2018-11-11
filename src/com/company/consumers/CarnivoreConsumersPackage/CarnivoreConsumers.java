package com.company.consumers.CarnivoreConsumersPackage;

import com.company.consumers.Consumers;

import java.util.Objects;

public abstract class CarnivoreConsumers extends Consumers {
    private int weight;
    private int lifespan;
    private String gender;

    public CarnivoreConsumers(int weight, int lifespan, String gender) {
        this.weight = weight;
        this.lifespan = lifespan;
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public int getLifespan() {
        return lifespan;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public void canEat() {
        System.out.println("I  eat meat");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarnivoreConsumers)) return false;
        CarnivoreConsumers that = (CarnivoreConsumers) o;
        return weight == that.weight &&
                lifespan == that.lifespan &&
                Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, lifespan, gender);
    }
}

