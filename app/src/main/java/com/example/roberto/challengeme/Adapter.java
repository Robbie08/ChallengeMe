package com.example.roberto.challengeme;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.widget.Switch;

import com.example.roberto.challengeme.Fragments.ChallengeAFriend;
import com.example.roberto.challengeme.Fragments.Challenges;
import com.example.roberto.challengeme.Fragments.Profile;

/**
 * Created by Roberto on 5/8/2016.
 */
public class Adapter extends FragmentPagerAdapter{


    private String Fragments[] = {"Challenges" , "VS Friend", "Profile"};
    public Adapter(android.support.v4.app.FragmentManager fm){

        super(fm);
    }

    //Formatting purposes for viewpager
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Challenges();
            case 1:
                return new ChallengeAFriend();
            case 2:
                return new Profile();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return Fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position){

        return Fragments[position];
    }
}
