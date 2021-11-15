/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week06;

import java.util.Arrays;

public class HighArrayDynamic {

    private int nElems;
    private long[] a;
    private final int INITIALSIZE = 2;

    public HighArrayDynamic() {
        a = new long[INITIALSIZE];
        nElems = 0;
    }

    public HighArrayDynamic(int capacity) {
        a = new long[capacity];
        nElems = 0;
    }

    public void add(long x) {
        a[nElems] = x;
        nElems++;
    }

    public String toString() {
        String temp = "[" + a[0];
        for (int i = 1; i < a.length; i++) {
            temp = temp + "," + a[i];
        }

        temp = temp + "]";
        return temp;

    }

    public void divide(long y) {

//        long[] b = new long[a.length *2];
//        
//        
//        for(int i =0; i < a.length;i++){
//            b[i]=a[i];
//        }
      
//        Arrays.sort(a);
//        try {
//            System.out.println("Testing Try and Catch");
            double x = 1 / y;
            
            System.out.println(x);
//        } catch (Exception e) {
//            System.out.println("Catching the error");
//            System.out.println(e.getMessage() );
//        } finally {
//            System.out.println("Finally part of Catching the error");
//        }

    }

    public long get(int index){
        return a[index];
    }
    //a[5,3,20,0,0,0]
    //a[5,5,5,5,0,]
    //a[5,5,3,20}
    public void shiftRigh() {
    for (int i = nElems - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
    }
    
    int size(){
        return a.length;
    }
    
    }
