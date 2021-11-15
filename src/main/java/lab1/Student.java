/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mk_no
 */
public class Student {
    String name;
    double gpa;
    
    public Student(){
        name="";
        gpa = 0;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setGPA(double a){
        gpa = a;
    }
    public String toString(){
        return "Student(" + name + ","+ gpa +")";
    }
    
}
