package com.company.recyclers.Decomposers;

import com.company.recyclers.Recyclers;

public abstract class Decomposers extends Recyclers {
    @Override
    public void canEat() {
        System.out.println("We recycle matter back to soil");
    }
}
