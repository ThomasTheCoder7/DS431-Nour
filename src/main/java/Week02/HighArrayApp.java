package Week02;

import java.io.FileNotFoundException;
import java.util.ArrayList;

class HighArrayApp {

    public static void main(String[] args) throws FileNotFoundException {
        int maxSize = 100;            // array size
        HighArray arr;                // reference to array
        arr = new HighArray(maxSize); // create the array

        arr.fillArray(9);
        
        arr.display();
        
        arr.bubbleSort();
        arr.display();
//        int pos = arr.binarySearch(120);
//        System.out.println(pos);
//        arr.insertOrdered(77);               // insert 10 items
//        arr.insert(99);
//        System.out.println(arr);
//        arr.insert(19);
//        arr.insert(44);
//        arr.insert(2);
//
//        ArrayList<Integer> aList = new ArrayList(2);
//        aList.add(5);
//        aList.add(7);
//        System.out.println(aList);
//        aList.add(70);
//        aList.add(17);
//        aList.add(12);
//        aList.add(1);
//        System.out.println(aList);
//        arr.insert(99);
//        System.out.println(arr);

        // arr.insert(44);
//      arr.insert(55);
//      arr.insert(22);
//      arr.insert(88);
//      arr.insert(11);
//      arr.insert(00);
//      arr.insert(66);
//      arr.insert(33);
//      arr.readIntFile("~/temp/data1.txt");
//        arr.display();                // display items
//
//        int searchKey = 35;           // search for item
//        if (arr.find(searchKey)) {
//            System.out.println("Found " + searchKey);
//        } else {
//            System.out.println("Can't find " + searchKey);
//        }
//
//        arr.delete(00);               // delete 3 items
//        arr.delete(55);
//        arr.delete(99);
//
//        arr.display();                // display items again
    }  // end main()
}  // end class HighArrayApp
