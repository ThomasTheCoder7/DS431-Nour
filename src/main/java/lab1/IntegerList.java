/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

// ***************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//
// ***************************************************************
public class IntegerList {

    int[] list; //values in the list

//-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size) {
        list = new int[size];
    }

//-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize() {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
    }
//-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + ":\t" + list[i]);
        }
    }
}

// ***************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//
// *************************************************************** import java.util.Scanner;

