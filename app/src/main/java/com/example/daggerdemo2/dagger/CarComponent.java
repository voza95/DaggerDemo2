package com.example.daggerdemo2.dagger;

import com.example.daggerdemo2.MainActivity;
import com.example.daggerdemo2.car.Car;
import com.example.daggerdemo2.car.Wheels;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    //PROVISION METHODS
    Car getCar();

    //When using FIELD INJECTION: param cannot be a super class
    void inject(MainActivity mainActivity);

}
