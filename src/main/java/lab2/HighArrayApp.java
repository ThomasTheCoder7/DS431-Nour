package lab2;

class HighArrayApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array

      arr.insertOrdered(77);               // insert 10 items
      arr.insertOrdered(99);
      arr.insertOrdered(44);
      arr.insertOrdered(55);
      arr.insertOrdered(22);
      arr.insertOrdered(88);
      arr.insertOrdered(11);
      arr.insertOrdered(00);
      arr.insertOrdered(66);
      arr.insertOrdered(33);

      arr.display();                // display items

//      int searchKey = 35;           // search for item
//      if( arr.find(searchKey) )
//         System.out.println("Found " + searchKey);
//      else
//         System.out.println("Can't find " + searchKey);
//
//      arr.delete(00);               // delete 3 items
//      arr.delete(55);
//      arr.delete(99);
//
//      arr.display();                // display items again
      }  // end main()
   }  // end class HighArrayApp
