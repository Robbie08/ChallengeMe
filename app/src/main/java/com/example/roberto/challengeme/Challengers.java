package com.example.roberto.challengeme;

import android.widget.ImageView;

import org.w3c.dom.Text;

/**
 * Created by Roberto on 5/12/2016.
 */
public class Challengers {

    private String Challengers;
    private ImageView ChallengersAvatar;


    public String getChallengers(){
        return Challengers;
    }
    public ImageView getChallengersAvatar(){
        return ChallengersAvatar;
    }

    public void setChallengrs(String UserName){UserName = UserName;}
    public void setChallengersAvatar(ImageView ChallengersAvatar){ChallengersAvatar = ChallengersAvatar;}

    public void Challengers(String users, ImageView avatar){

        Challengers = users;
        ChallengersAvatar = avatar;


    }

}
