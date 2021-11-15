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
public class GenericClass<T> {
    T t;
    public GenericClass(T x){
        t = x;
    }
 public T  isQual(T t1){
       if( t != t1) return t;
        return t1;
    }
    
}
