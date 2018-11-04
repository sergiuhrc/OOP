package com.company.Recyclers.Detritivores;

import com.company.Recyclers.Recyclers;

public abstract class Detritivores extends Recyclers {
    @Override
    public void canEat() {
        System.out.println("We eat dead plants and animal matter");
    }

}
