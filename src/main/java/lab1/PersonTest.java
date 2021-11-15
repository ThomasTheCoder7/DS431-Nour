/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author mk_no
 */
public class PersonTest {

    public static void main(String[] args) {

        Person[] personList = new Person[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter name");
            String name = input.next();
            System.out.println("Please enter age");
            int age = input.nextInt();
            personList[i] = new Person(name, age);
        }

        for (int i = 0; i < personList.length; i++) {
            System.out.println(personList[i]);
        }

//        Person p1 = new Person();
//        // أحسب سنة الميلاد
//        int u = p1.calcYearofBirth();
//        
//        // اطبع سنة الميلاد
//        System.out.println(u);
//        
//        
//        
//        Person p2  = new Person("Badr",20);
//        System.out.println(p1.toString());
//        System.out.println(p2);
//        
//        p1.setAge(10);
//       int x = p1.getAge();
//       x = x+ 10;
//        System.out.println(x);
    }

}
