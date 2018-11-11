package com.company.consumers.OmnivoresConsumersPackage;

import com.company.consumers.Consumers;

public class OmnivoresConsumers extends Consumers {
    @Override
    public void canEat() {
        System.out.println("I eat meat and plants");
    }


}
