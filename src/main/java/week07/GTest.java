/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07;

import Week01.Person;

/**
 *
 * @author mk_no
 */
public class GTest {

    public static void main(String[] args) {

//        Person p= new Person("iayd",20);
//        Student s = new Student(1,"aa","bb",22.9);
//         GenericClass<Student> g3 = new GenericClass(p);
//       GenericClass<Double> g1 = new GenericClass(10.5);
//       GenericClass<Integer> g2 = new GenericClass(10);
//        
//        System.out.println(   g1.isQual(20.9));
//        System.out.println(   g2.isQual(10));
//        //Person p = new Person("Ali",15);
        //   System.out.println(   g3.isQual(p));
        HighArrayG<Double> h1 = new HighArrayG(Double.class, 20);
        HighArrayG<Integer> h2 = new HighArrayG(Integer.class, 22);
        HighArrayG<Person> h3 = new HighArrayG(Person.class, 12);

        h1.insert(14.0);
        h1.insert(12.0);
        h2.insert(1);
        h2.insert(2);
        h2.insert(3);

        h3.insert(new Person("Omer", 12));
        h3.insert(new Person("Awad", 30));

        System.out.println(h2.sum());
        System.out.println(h3.sum());

        System.out.println(h1.sum());

    }

}
