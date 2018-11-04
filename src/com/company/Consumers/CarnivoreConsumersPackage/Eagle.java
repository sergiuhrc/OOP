package com.company.Consumers.CarnivoreConsumersPackage;

public class Eagle  extends CarnivoreConsumers {
   private String subspecies;
   private   int speed;
   private double wingspan;

    public Eagle(int weight ,int lifespan,String gender,String species, int speed,  double wingspan) {
        super(weight,lifespan,gender);
        this.subspecies = species;
        this.speed = speed;
        this.wingspan = wingspan;
    }




}
