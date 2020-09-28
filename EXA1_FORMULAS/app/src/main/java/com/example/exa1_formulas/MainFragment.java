package com.example.exa1_formulas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    RadioGroup radioGroupF;
    Button btnSelec;
    NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        radioGroupF = view.findViewById(R.id.radioGroupF);
        btnSelec = view.findViewById(R.id.btnSelec);

        btnSelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedId = radioGroupF.getCheckedRadioButtonId();
                switch (checkedId){
                    case R.id.radiobtn1:
                        navController.navigate(R.id.action_mainFragment3_to_firstFragment2);
                        break;
                    case R.id.radiobtn2:
                        navController.navigate(R.id.action_mainFragment3_to_secondFragment);
                        break;
                    case R.id.radiobtn3:
                        navController.navigate(R.id.action_mainFragment3_to_thirdFragment);
                        break;
                    case R.id.radiobtn4:
                        navController.navigate(R.id.action_mainFragment3_to_fourthFragment);
                        break;
                    case R.id.radiobtn5:
                        navController.navigate(R.id.action_mainFragment3_to_fifthFragment);
                        break;
                    case R.id.radiobtn6:
                        navController.navigate(R.id.action_mainFragment3_to_sixthFragment);
                        break;
                    case R.id.radiobtn7:
                        navController.navigate(R.id.action_mainFragment3_to_seventhFragment);
                        break;
                    case R.id.radiobtn8:
                        navController.navigate(R.id.action_mainFragment3_to_eighthFragment);
                        break;
                    case R.id.radiobtn9:
                        navController.navigate(R.id.action_mainFragment3_to_ninthFragment);
                        break;
                    case R.id.radiobtn10:
                        navController.navigate(R.id.action_mainFragment3_to_tenthFragment);
                        break;
                }
            }
        });


    }
}