/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week01;

/**
 *
 * @author mk_no
 */
public class Student {
    int id;
    String firstName;
    String lastName;
    double gpa;
    public Student(int id,String fname, String lname, double gpa){
        this.id = id;
        firstName = fname;
        lastName = lname;
        this.gpa = gpa;
    }
 public String toString(){
     return firstName + " " + lastName + " " + gpa;
 }
    
}
