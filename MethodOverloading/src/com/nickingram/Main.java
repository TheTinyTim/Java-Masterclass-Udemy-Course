package com.nickingram;

public class Main {

    /*
     * Notes:
     *
     */
    
    public static void main(String[] args) {
        int newScore = calculateScore ("Nick", 500);
        System.out.println ("New score is " + newScore);
        
        //---------------CHALLENGE---------------\\
    }
    
    public static int calculateScore (String playerName, int score)
    {
        System.out.println ("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
}
