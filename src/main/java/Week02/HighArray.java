package Week02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------

    public HighArray(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-----------------------------------------------------------

    public boolean find(long searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j] == searchKey) // found item?
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

    public void insert(long value) // put element into array
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

    public void insertOrdered(long value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j] > value) // (linear search)
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

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value == a[j]) {
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

    public int binarySearch(int searchKey) {
        int left = 0, right = nElems - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (a[pivot] == searchKey) {
                return pivot;       // found
            } else {
                if (a[pivot] < searchKey) {
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

    void fillArrayOrdered(int n) {
        Random r = new Random(100);
        for (int i = 0; i < n; i++) {
            insertOrdered(r.nextInt(100));
        }

    }

    void fillArray(int n) {
        Random r = new Random(100);
        for (int i = 0; i < n; i++) {
            insert(r.nextInt(1000));
        }

    }

    public  void bubbleSort() {
        boolean needNextPass = true;

        for (int k = 1; k < nElems && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < nElems - k; i++) {
                if (a[i] > a[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    long temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
}  // end class HighArray





////////////////////////////////////////////////////////////////
