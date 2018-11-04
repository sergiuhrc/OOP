package com.company.Consumers.HerbivoreConsumersPackage;

import com.company.Consumers.Consumers;

public class HerbivoreConsumers extends Consumers {
    @Override
    public void canEat() {
        System.out.println("We eat plants");
    }


}
