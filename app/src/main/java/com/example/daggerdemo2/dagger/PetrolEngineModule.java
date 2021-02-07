package com.example.daggerdemo2.dagger;

import com.example.daggerdemo2.car.Engine;
import com.example.daggerdemo2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
