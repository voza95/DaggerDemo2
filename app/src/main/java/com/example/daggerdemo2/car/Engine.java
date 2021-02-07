package com.example.daggerdemo2.car;


import javax.inject.Inject;

public interface Engine {
    static final String TAG = "Engine";

    //Can't inject because if it is an interface
    /*@Inject
    public Engine() {
    }*/

    void start();
}
