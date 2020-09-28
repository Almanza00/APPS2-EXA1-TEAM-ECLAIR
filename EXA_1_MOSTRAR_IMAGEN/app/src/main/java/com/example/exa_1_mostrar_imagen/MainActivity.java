package com.example.exa_1_mostrar_imagen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity implements  SeekBar.OnSeekBarChangeListener {
    private SeekBar seekBar;
    int value;
    Activity activity;
    private int progressBar;
    private  int imagecountleft, imagecountcentral, imagecountRaihtt;
    private int[] imageList = new int[]{R.drawable.dog_uno,R.drawable.dog_dos,R.drawable.dog_tres,R.drawable.dog_cuatro,R.drawable.dog_cinco};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        activity = MainActivity.this;
        seekBar.setOnSeekBarChangeListener(this);
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        progressBar = progress;
        imagecountleft = progressBar-1;
        imagecountcentral = progressBar;
        imagecountRaihtt = progressBar+1;
        value = activity.getResources().getConfiguration().orientation;

        if (value == Configuration.ORIENTATION_PORTRAIT) {
            replaceFrag(imagecountcentral);

        }

        if (value == Configuration.ORIENTATION_LANDSCAPE) {

            replacefragLand(imagecountleft,imagecountcentral,imagecountRaihtt);
        }

       // replacefragLand(imagecountleft,imagecountcentral,imagecountRaihtt);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
    public void replaceFrag(int progressBar){
        switch (progressBar){
            case 0:
                setfragePortrait(new unoFragment());
                break;
            case 1:
                setfragePortrait(new DosFragment());
                break;
            case 2:
                setfragePortrait(new TresFragment());
                break;
            case 3:
                setfragePortrait(new CuatroFragment());
                break;
            case 4:
                setfragePortrait(new CincoFragment());
                break;
            case 5:
                setfragePortrait(new SeisFragment());
                break;
            case 6:
                setfragePortrait(new SieteFragment());
                break;

        }

    }
    public void replacefragLand(int fragmentleft,int fraCenter ,int fraRaight){
        switch (fragmentleft){
            case 0:
                setfragleft(new unoFragment());
                break;
            case 1:
                setfragleft(new DosFragment());
                break;
            case 2:
                setfragleft(new TresFragment());
                break;
            case 3:
                setfragleft(new CuatroFragment());
                break;
            case 4:
                setfragleft(new CincoFragment());
                break;
            case 5:
                setfragleft(new SeisFragment());
                break;
            case 6:
                setfragleft(new SieteFragment());
                break;

        }
        switch (fraCenter){
            case 0:
                setfragePortrait(new unoFragment());
                break;
            case 1:
                setfragePortrait(new DosFragment());
                break;
            case 2:
                setfragePortrait(new TresFragment());
                break;
            case 3:
                setfragePortrait(new CuatroFragment());
                break;
            case 4:
                setfragePortrait(new CincoFragment());
                break;
            case 5:
                setfragePortrait(new SeisFragment());
                break;
            case 6:
                setfragePortrait(new SieteFragment());
                break;

        }
        switch (fraRaight){
            case 0:
                setraigth(new unoFragment());
                break;
            case 1:
                setraigth(new DosFragment());
                break;
            case 2:
                setraigth(new TresFragment());
                break;
            case 3:
                setraigth(new CuatroFragment());
                break;
            case 4:
                setraigth(new CincoFragment());
                break;
            case 5:
                setraigth(new SeisFragment());
                break;
            case 6:
                setraigth(new SieteFragment());
                break;
            case 7:
                setraigth(new unoFragment());

        }

    }
    public void setfragePortrait(Fragment fragment){
        //se necesita una transaccion
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        //remplazar nuestro layout con el fragmento
        fragmentTransaction.replace(R.id.frameLayoutMain,fragment);
        //commit
        fragmentTransaction.commit();

    }
    public void setfragleft(Fragment left){
        //se necesita una transaccion
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        //remplazar nuestro layout con el fragmento
        fragmentTransaction.replace(R.id.frameLayot1, left);

        //commit
        fragmentTransaction.commit();
    }
    public void setraigth( Fragment right){
        //se necesita una transaccion
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        //remplazar nuestro layout con el fragmento
        fragmentTransaction.replace(R.id.frameLayout3,right);
        //commit
        fragmentTransaction.commit();
    }


}