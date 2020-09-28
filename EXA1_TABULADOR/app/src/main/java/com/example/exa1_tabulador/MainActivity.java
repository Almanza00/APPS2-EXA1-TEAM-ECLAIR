package com.example.exa1_tabulador;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mostrarShuttle (View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ShuttleFragment shuttleFragment = new ShuttleFragment();
        ft.replace(R.id.frameLyt,shuttleFragment);
        ft.commit();
    }

    public void mostrarAres (View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        AresFragment aresFragment = new AresFragment();
        ft.replace(R.id.frameLyt,aresFragment);
        ft.commit();
    }

    public void mostrarFalcon(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FalconFragment falconFragment = new FalconFragment();
        ft.replace(R.id.frameLyt,falconFragment);
        ft.commit();
    }


}