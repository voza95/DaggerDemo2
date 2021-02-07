package com.example.daggerdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //When using construction injection
//    private Car car;

    //When using FIELD INJECTION: Need to remove private/final to make it field injection.
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        //When using construction injection
        //car = component.getCar();

        //When using FIELD INJECTION
        component.inject(this);

        car.drive();
    }
}
//Dagger(Directed Acyclic Graph)ger