package com.company.consumers.CarnivoreConsumersPackage;

import java.util.Objects;

public class Eagle<T extends Number>  extends CarnivoreConsumers {
   private String subspecies;
   private   T speed;
   private  T wingspan;

    public Eagle(int weight ,int lifespan,String gender,String species, T speed,  T wingspan) {
        super(weight,lifespan,gender);
        this.subspecies = species;
        this.speed = speed;
        this.wingspan = wingspan;
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eagle)) return false;
        Eagle<?> eagle = (Eagle<?>) o;
        return Objects.equals(subspecies, eagle.subspecies) &&
                Objects.equals(speed, eagle.speed) &&
                Objects.equals(wingspan, eagle.wingspan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subspecies, speed, wingspan);
    }

    @Override
    public String toString() {
        return "Eagle{" +" " +
                "Weight= "+ getWeight()
                +
                " Lifespan= "+getLifespan()
                +
                " Gender= "+getGender()
                +
                " Subspecies=" + subspecies +
                ", Speed=" + speed +
                ", Wingspan=" + wingspan +
                '}';
    }
}
