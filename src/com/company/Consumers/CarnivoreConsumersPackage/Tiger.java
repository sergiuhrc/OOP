package com.company.Consumers.CarnivoreConsumersPackage;

import java.util.Objects;

public class Tiger extends CarnivoreConsumers {
    int speed;
    String subspecies;


    public Tiger(int weight, int lifespan, String gender,int speed, String subspecies) {
        super(weight, lifespan, gender);
        this.speed = speed;
        this.subspecies = subspecies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tiger)) return false;
        if (!super.equals(o)) return false;
        Tiger tiger = (Tiger) o;
        return speed == tiger.speed &&
                Objects.equals(subspecies, tiger.subspecies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, subspecies);
    }
}
