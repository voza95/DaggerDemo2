package com.example.daggerdemo2;

import javax.inject.Inject;

//Suppose this was from 3rd part library
public class Wheels {
    //We don't own this class so we can't annotate it with @Inject.
    private static final String TAG = "Wheels";

    private Rims rims;
    private Tires tires;
    /*@Inject
    public Wheels() {
    }*/

    //To inject this we have to make a module class of this.
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
