package com.example.daggerdemo2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    //When using METHOD INJECTION:This is the least used out of constructions and field injection.
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
        //Order this will called:- constructions, field and then method
    }
    //Filed and method injection are only automatically executed if we also do a constructions injection.

    public void drive(){
        Log.d(TAG, "driving....");
    }
}
