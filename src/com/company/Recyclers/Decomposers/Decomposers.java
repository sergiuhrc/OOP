package com.company.Recyclers.Decomposers;

import com.company.Recyclers.Recyclers;

public abstract class Decomposers extends Recyclers {
    @Override
    public void canEat() {
        System.out.println("We recycle matter back to soil");
    }
}
