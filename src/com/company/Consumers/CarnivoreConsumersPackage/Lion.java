package com.company.Consumers.CarnivoreConsumersPackage;

import java.util.Objects;

public class Lion extends CarnivoreConsumers {
    int speed;


    public Lion(int weight, int lifespan, String gender ,int speed) {
        super(weight, lifespan, gender);
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lion)) return false;
        if (!super.equals(o)) return false;
        Lion lion = (Lion) o;
        return speed == lion.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed);
    }
}
