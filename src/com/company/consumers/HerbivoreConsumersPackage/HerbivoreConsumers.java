package com.company.consumers.HerbivoreConsumersPackage;

import com.company.consumers.Consumers;

public class HerbivoreConsumers extends Consumers {
    @Override
    public void canEat() {
        System.out.println("We eat plants");
    }


}
