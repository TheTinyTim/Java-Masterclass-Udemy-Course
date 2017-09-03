package com.nickingram;

/*
 * Notes:
 *      Chars can only store one character
 *      Chars can also store Unicodes (Do not put the + operator in the unicode character):
 *          https://unicode-table.com/en/#control-character
 */

public class Main {

    public static void main(String[] args) {
        //Width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println ("Unicode output was: " + myChar);
        
        boolean myBoolean = false;
        
        //-------------CHALLENGE-------------
        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display on screen.
        
        char registerSym = '\u00AE';
        System.out.println ("Unicode Restered Symbol: " + registerSym);
    }
}
