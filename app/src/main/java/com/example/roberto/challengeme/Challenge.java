package com.example.roberto.challengeme;

/**
 * Created by Roberto on 5/12/2016.
 *
 * Class that holds all the characteristics of the Challenge
 */
public class Challenge {

    private String Challenge;
    private String ChallengeDescription;

    public String getChallenge() {
        return Challenge;
    }

    public String getChallengeDescription(){
        return ChallengeDescription;
    }

    public void setChallenge(String Challenge) {Challenge = Challenge;}

    public void setChallengeDescription(String ChallengeDescription){ChallengeDescription = ChallengeDescription;}

    public void ListInfomtion(String chall,String challD){
        Challenge = chall;
        ChallengeDescription = challD ;
    }


}
