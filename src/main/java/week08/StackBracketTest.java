/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08;

import java.io.IOException;
import java.util.Scanner;

/**
 * Implement a Symbol Balancer. Which tests and expression containing brackets
 * [](){} and determines if brackets are balanced. Implementation uses a
 * StackArray.
 *
 * @version 1.0 08
 * @author
 */
public class StackBracketTest {

    private String input;

    /**
     * Default Constructor
     *
     */
    public StackBracketTest() {
        input = null;
    }

    /**
     * Alternate Constructor Sets Expression to be evaluated
     *
     * @param in string containing expression to be balanced
     */
    public StackBracketTest(String in) {
        // complete this constructor
    }

    /**
     * Set string containing expression to be evaluated
     *
     * @param in string containing expression to be balanced
     */
    public void setExpression(String in) {
        input = in;
    }
  
    /**
     * Evaluate expression and determine correctness
     *
     */
    public void check() {
        int stackSize = input.length();
        StackArrayG<Character> theStack = new StackArrayG(stackSize);
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
                // complete the following switch statement. 
            switch (ch) {
                // if char is an opening bracket i.e. [({ then push onto stack 
                // if char is a closing bracket i.e. ])} then pop the top 
                // element off stack (checking that stack is not empty) 
                // and check that it is a matching opening bracket for 
                // the current closing bracket
                // if it doesn’t match or the stack is empty then its and
                // invalid expression. 
            }
        }
        // Test that the stack is empty. If not the expression is invalid
    }

    /**
     * This main method implements a little interactive test program which when
     * executed repeatedly prompts the user for an expression and tests the
     * expression.
     */
    public static void main(String[] args) throws IOException {
        String input = "";
        StackBracketTest sBracket = new StackBracketTest();
        // Declare a variable of type StackBracketTest and create 
        // and assign to it and instance of StackBracketTest class. 
        // Which would be the most appropriate constructor to use here?
        // note this is a do while loop which is different to a while
        // loop in that it will always execute at least once. 
        // Can you determine what condition causes the loop to terminate? 
        do {
            System.out.print("Enter string containing delimiters: ");
            // read a string from the console using the Scanner class. 
             // SCANNER CODE  
            // can you determine what this if statement is doing?  
            if (!input.equals("")) {
                // pass the string to the StackBracketTest object created
                // above using the most appropriate method.
                sBracket.setExpression(input);
                // Call the StackBracketTest check method.
                // Test result of check method and display result in form of
                // a message to the user e.g. “This statement is valid” 
            }
        } while (!input.equals(""));
    }
}
