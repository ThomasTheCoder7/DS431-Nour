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
import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new  Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
            System.out.print("j=");
            for (int j = 0; j < n; j++) {
                sum++;
                System.out.print(" " + j);
            }
            
            System.out.println("");
        }

    }

}
