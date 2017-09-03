package com.nickingram;

/*
 * Notes:
 *     If you put a number with a decimal point you do not need to put D in the variable. Java will
 *      know what type you want it to be.
 *     Int values do not hold the decimals when being divided
 *     Doubles are generally better to use over floats due to its better precision
 *     You can also put the _ in doubles/floats to be more readable
 */

public class Main {
    
    public static void main(String[] args) {
        //Width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
        //Width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //Width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
    
        System.out.println ("myIntValue = " + myIntValue);
        System.out.println ("myFloatValue = " + myFloatValue);
        System.out.println ("myDoubleValue = " + myDoubleValue);
        
        // ------------------CHALLENGE------------------
        // Convert a given number of pounds to kilograms
        // 1.   Create a variable to store the number of pounds
        // 2.   Calculate the number of Kilograms for the number above and store in a variable.
        // 3.   Print out the result.
        //
        // NOTES:   1 pound is equal to 0.45359237 kilograms.
        
        double myPounds = 200d;
        double poundsToKilogram = myPounds * 0.45359237d;
        System.out.println ("There are " + poundsToKilogram + " Kilograms in " + myPounds + " pounds!");
        double pi = 3.141_592_7d;
    }
}
