package com.example.roberto.challengeme;

/**
 * Created by Roberto on 5/12/2016.
 *
 * Class that holds all the characteristics of the Challenge
 */
public class Challenge{

    private String ChallengeTitle;
    private String ChallengeDescription;

    public Challenge(String chall,String challD){
        ChallengeTitle = chall;
        ChallengeDescription = challD ;
    }
    public Challenge(){

    }

    public String getChallenge() {
        return ChallengeTitle;
    }

    public String getChallengeDescription(){
        return ChallengeDescription;
    }

    public void setChallenge(String Challenge) {Challenge = Challenge;}

    public void setChallengeDescription(String ChallengeDescription){ChallengeDescription = ChallengeDescription;}



}
