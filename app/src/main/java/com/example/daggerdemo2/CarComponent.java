package com.example.daggerdemo2;

import dagger.Component;

@Component(modules = Wheels.class)
interface CarComponent {

    //PROVISION METHODS
    Car getCar();

    //When using FIELD INJECTION: param cannot be a super class
    void inject(MainActivity mainActivity);

}
