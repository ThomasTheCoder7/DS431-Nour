/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArrayG<T extends Comparable> implements Stats {

    private final T[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------

    public T[] getArray() {
        return a;
    }

    public HighArrayG(Class<T> c, int max) // constructor
    {
        this.a = (T[]) Array.newInstance(c, max);    // create the array
        nElems = 0;                        // no items yet
    }

    //-----------------------------------------------------------
    public boolean find(T searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j].compareTo(searchKey) == 0) // found item?
            {
                break;                       // exit loop before end
            }
        }
        if (j == nElems) // gone to end?
        {
            return false;                   // yes, can't find it
        } else {
            return true;                    // no, found it
        }
    }  // end find()
    //-----------------------------------------------------------

    public void insert(T value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //-----------------------------------------------------------

    public void insertOrdered(T value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j].compareTo(value) == 1) // (linear search)
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k - 1];
        }
        a[j] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()
    //-----------------------------------------------------------

    public boolean delete(T value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value.compareTo(a[j]) == 0) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move higher ones down
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //-----------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-----------------------------------------------------------

    public int binarySearch(T searchKey) {
        int left = 0, right = nElems - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (a[pivot].compareTo(searchKey) == 0) {
                return pivot;       // found
            } else {
                if (a[pivot].compareTo(searchKey) == -1) {
                    left = pivot + 1;  // search right
                } else {
                    right = pivot - 1;  // search left
                }
            }
        }
        return -1;
    }

    public int size() {
        return nElems;
    }
//"java.lang.Number"
//|| a[0].getClass() == Class.forName("Double"));

    public double sum() {
        double s = 0;
        try {
            
     //       if (a[0].getClass().isInstance(Number.class) ) {
                if(Number.class.isAssignableFrom(a[0].getClass())){
                for (int i = 0; i < nElems; i++) {
                    double d = (Double) a[i];
                    s = s + d;
                }
            }//if

//            if (a[0] instanceof Integer) {
//                for (int i = 0; i < nElems; i++) {
//                    s = s + (Integer) a[i];
//                }//for
//            }//if

        } catch (Exception cce) {
            System.out.println(cce.getMessage());
        }

        return s;

    }

}  // end class HighArray

