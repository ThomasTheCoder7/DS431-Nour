/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week06;

public class HighArrayDynamicTest
{
   public static void main(String[] args)
   {
      HighArrayDynamic ae = new HighArrayDynamic(20);
      System.out.println(ae);
      ae.add(5);
      ae.add(8);
      System.out.println(ae);
      ae.add(2);
      ae.add(7);  
      ae.add(6);
      ae.add(13);
      ae.add(20);
      ae.add(25);  
      System.out.println(ae);
      ae.add(88);
      System.out.println(ae);
      for(int i =0; i < ae.size(); i++){
          ae.divide(ae.get(i));
      }
          
   //   ae.readySort();
   
   ae.shiftRigh();
 
      System.out.println(ae);
      
   }
}


