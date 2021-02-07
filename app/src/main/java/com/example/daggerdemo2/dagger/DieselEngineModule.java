package com.example.daggerdemo2.dagger;

import com.example.daggerdemo2.car.DieselEngine;
import com.example.daggerdemo2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);

}
