package com.example.daggerdemo2.dagger;

import com.example.daggerdemo2.car.Rims;
import com.example.daggerdemo2.car.Tires;
import com.example.daggerdemo2.car.Wheels;

import dagger.Module;
import dagger.Provides;

//Module are classes that contributes to the object graph.
@Module
public class WheelsModule {

    @Provides
    Rims providesRims(){
        return new Rims();
    }

    @Provides
    Tires providesTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels wheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }

}
