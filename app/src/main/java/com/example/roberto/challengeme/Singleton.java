package com.example.roberto.challengeme;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Roberto on 5/13/2016.
 *
 * Singleton Class:
 *
 * This class will create a new user if the user has not already been created
 */
public class Singleton {

    private ArrayList<Challengers> mChallengers;
    private static Singleton sSingleton = null;
    private Context mContext;

    private Singleton(Context appContext) {

        mContext = appContext;
        mChallengers = new ArrayList<Challengers>();
    }

    public ArrayList<Challengers> getmChallengers() {
        return mChallengers;
    }

    public static Singleton get(Context c) {
        if (sSingleton == null) {
            sSingleton = new Singleton(c.getApplicationContext());

        }
        return sSingleton;
    }

    public void addChallengers(Challengers ch){
        mChallengers.add(ch);
    }
}



