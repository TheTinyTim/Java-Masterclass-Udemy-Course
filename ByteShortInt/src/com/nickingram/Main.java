package com.nickingram;

/*
 * Notes:
 *     You can put _ in any number type variable to make them more readable
 *     MUST cast when doing any math that isn't with a int value ex: byte newByte = (byte) myByte / 2;
 */

public class Main {

    public static void main(String[] args) {
        //Byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        
        //Short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
    
        //Int has a width of 32
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;
        
        //Long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        
        byte myByte = 28;
        short myShort = -157;
        int myInt = -293847;
        long myLongSum = 50000L + (10L * (myByte + myShort + myInt));
    
        System.out.println ("myLongSum = " + myLongSum);
    }
}
