package com.example.roberto.challengeme;

import android.widget.ImageView;

import org.w3c.dom.Text;

/**
 * Created by Roberto on 5/12/2016.
 */
public class Users {

    private String UserName;
    private ImageView UserAvatar;


    public String getUserName(){
        return UserName;
    }
    public ImageView getUserAvatar(){
        return UserAvatar;
    }

    public void setUserName(String UserName){UserName = UserName;}
    public void setUserAvatar(ImageView UserAvatar){UserAvatar = UserAvatar;}

    public void Users(String users, ImageView avatar){

        UserName = users;
        UserAvatar = avatar;


    }

}
