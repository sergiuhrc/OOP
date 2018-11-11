package com.company.recyclers.Detritivores;

import com.company.recyclers.Recyclers;

public abstract class Detritivores extends Recyclers {
    @Override
    public void canEat() {
        System.out.println("We eat dead plants and animal matter");
    }

}
