package com.example.roberto.challengeme;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Roberto on 5/12/2016.
 *
 * Class intended to contain the layout features of the fragment_challenges.xml file
 *
 */
public class EditFragment extends Fragment {

    TextView userName, challenge , ChallengeDescription;
    ImageView userAvatar;
    Button logIn;
    String sUserName,sChallenge,sChallengeDescription;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_challenges, container, false);
        userName = (TextView) view.findViewById(R.id.tvUserName);
        challenge = (TextView) view.findViewById(R.id.tvChallenge);
        userAvatar = (ImageView) view.findViewById(R.id.ivUserImage);
        logIn = (Button) view.findViewById(R.id.bSignIn);
        ChallengeDescription = (TextView) view.findViewById(R.id.tvDescription);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Setting our text to String
                sUserName = userName.getText().toString();
                sChallenge = challenge.getText().toString();
                sChallengeDescription = ChallengeDescription.getText().toString();

                //Challenge object
                Challenge list = new Challenge();

                list.setChallenge(sChallenge);
                list.setChallengeDescription(sChallengeDescription);

                //Users Object
                Users u = new Users();

                u.setUserName(sUserName);

                /////////////////////////////////////////////////////////////
                //                                                         //
                //                                                         //
                // Create Singleton that will contain all the information  //
                //                                                         //
                //                                                         //
                /////////////////////////////////////////////////////////////
            }


    });





        return view;

    }




}
