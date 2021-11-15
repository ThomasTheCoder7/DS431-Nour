package week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Week01.Person;
        
// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArrayPerson {

    private Person[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------

    public HighArrayPerson(int max) // constructor
    {
        a = new Person[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-----------------------------------------------------------

    public boolean find(String searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j].getName().compareTo(searchKey) ==0 ) // found item?
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

    public void insert(Person value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    public void readIntFile(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextInt()) {
            int next = input.nextInt();

            //???????
        }// end while

    }
    //-----------------------------------------------------------

    public void insertOrdered(Person value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j].getName().compareTo(value.getName()) > 0) // (linear search)
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

    public boolean delete(String value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value == a[j].getName()) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            if (nElems < a.length) {
                for (int k = j; k < nElems; k++) // move higher ones down
                {
                    a[k] = a[k + 1];
                }
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

    public int binarySearch(String searchKey) {
        int left = 0, right = nElems - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (a[pivot].getName() == searchKey) {
                return pivot;       // found
            } else {
                if (a[pivot].getName().compareTo(searchKey)<0 ) {
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

}  // end class HighArray


////////////////////////////////////////////////////////////////
