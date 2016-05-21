package com.example.roberto.challengeme.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roberto.challengeme.R;

/**
 * Created by Roberto on 5/8/2016.
 */
public class Challenges extends Fragment {

    TextView challenge; // Declaration for challenge text
    TextView userName;
    ImageView userImage;

    @Override
    public void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_challenges, parent,true);
        TextView challenge = (TextView) view.findViewById(R.id.tvChallenge);
        TextView userName = (TextView) view.findViewById(R.id.tvUserName);
        ImageView userImage = (ImageView) view.findViewById(R.id.ivUserImage);

        


        return view;
    }


}


