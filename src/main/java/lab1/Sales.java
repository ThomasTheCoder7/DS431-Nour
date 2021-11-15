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

public class Sales {

    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("	");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("	" + i + "	" + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);
    }
}
