/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07;

/**
 *
 * @author mk_no
 */
public class WhyWeUseMethods {
    
    public static void main(String[] args){
        int[] a = {3,8,10,4,2};
        int[] b = {12,8,20,15 , 30};
        int[] c = {55,100,212,99,20,90,11,430,550};
        int[] d = {200,253,11,55,88,1,900,44,70};
        
int max = a[0];
        for(int i =1; i< a.length;i++){
            if(max< a[i]){
                max = a[i];
            }
        }
        
        System.out.println(max);
        
        
        max = b[0];
        for(int i =1; i< b.length;i++){
            if(max< b[i]){
                max = b[i];
            }
        }
        System.out.println(max);
        
        
        max = c[0];
        for(int i=1; i < c.length;i++){
            if(max < c[i]){
                max = c[i];
            }
        }
        System.out.println(max);
        
        
        max = d[0];
        for(int i=1; i < d.length;i++){
            if(max < d[i]){
                max = d[i];
            }
        }
        System.out.println(max);        
        
        
        System.out.println(getMax(a));
        System.out.println(getMax(b));
        System.out.println(getMax(c));
        
        
        
        
    }
    
    public static int getMax(int[] x){
        int max = x[0];
        for(int i =1; i< x.length;i++){
            if(max< x[i]){
                max = x[i];
            }
        }
        return max;
    }
}
