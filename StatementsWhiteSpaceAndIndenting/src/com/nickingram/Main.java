package com.nickingram;

public class Main {

    /*
     * Notes:
     *      A ; is needed to make a complete java statement (some exceptions)
     *      Statements don't need to be on the same line (see System.out.println on three lines)
     *
     *      Whitespace: Space between operations and expressions ex: myVariable + 1 (spaces between variable and 1)
     *      Indentation: Indenting your code so that it's more readable
     */
    
    public static void main(String[] args) {
        int myVariable = 50; //This whole line is a statement (assignment)
        myVariable++; //Complete statement as well
        System.out.println ("This is a complete statement");
        System.out.println ("This is" +
                "another" +
                "statement");
        
        int anothervariable = 5; myVariable--; System.out.println ("This is a valid statement but isn't recommended");
    }
}
