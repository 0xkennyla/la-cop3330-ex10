/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        double p1 = scan.nextInt();
        System.out.println("Enter the quantity of item 1:");
        double q1 = scan.nextInt();
        double total1 = p1*q1;
        System.out.println("Enter the price of item 2:");
        double p2 = scan.nextInt();
        System.out.println("Enter the quantity of item 2:");
        double q2 = scan.nextInt();
        double total2 = p2*q2;
        System.out.println("Enter the price of item 3:");
        double p3 = scan.nextInt();
        System.out.println("Enter the quantity of item 3:");
        double q3 = scan.nextInt();
        double total3 = p3*q3;
        double subtotal = total1+total2+total3;
        System.out.println("Subtotal: $" + subtotal);
        double tax = subtotal*0.055;
        System.out.println("Tax: $" + tax);
        double total = subtotal + tax;
        System.out.println("Total: $" + total);
    }
}