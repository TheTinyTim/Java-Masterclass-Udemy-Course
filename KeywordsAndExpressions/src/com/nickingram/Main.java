package com.nickingram;

public class Main {

    /*
     * Notes:
     *      Make sure not to use any of these keywords that are already in use by java:
     *          https://en.wikipedia.org/wiki/List_of_Java_keywords
     */
    
    public static void main(String[] args) {
        //A mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highScore = 50;
        
        if (highScore == 50) {
            System.out.println ("This is an expression");
        }
        
        //-------------CHALLENGE------------
        //In the following code that I will type below, write down what parts of the code
        //are expressions
        int score = 100; //score = 100; is an expression
        if (score > 99) { // score > 99 is an expression
            System.out.println ("You got the high score!"); // "You got the high score!" is an expression
            score = 0; // score = 0; is an expression
        }
    }
}
