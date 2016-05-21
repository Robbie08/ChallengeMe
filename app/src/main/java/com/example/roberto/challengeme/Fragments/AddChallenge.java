package com.example.roberto.challengeme.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.roberto.challengeme.Challenge;
import com.example.roberto.challengeme.R;

import java.util.ArrayList;

/**
 * Created by joshua on 5/21/2016.
 */
public class AddChallenge extends Fragment {

     EditText etAddChallenge;
     EditText etAddDescription;

      ArrayList<Challenge> arrayCh;//Eventually add challenges to database.

    @Override
    public void onStart(){
        super.onStart();
        arrayCh = new ArrayList<Challenge>();


    }


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_add_challenge, container,true);

        etAddChallenge = (EditText)v.findViewById(R.id.etAddChallenge);
        etAddDescription = (EditText)v.findViewById(R.id.etChallengeDescription);


        String challengeTitle = etAddChallenge.getText().toString();
        String challengeDescription = etAddDescription.getText().toString();

        Challenge  userInput = new Challenge(challengeTitle,challengeDescription);
        arrayCh.add(userInput);



        return v;
    }

}
