/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_16 {
     public static void main( String[] args )
	{
            String name  ;
            int age ;
            double salary;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Hello. What is your name?");
            name = sc.next();
            
            System.out.println("Hi, " + name + "!" + "   How old are you?");
            age = sc.nextInt();
            
            System.out.println("So you're " + age + " eh?  That's not old at all!\nHow much do you make, " + name );
            salary = sc.nextDouble();
            
            System.out.println(salary + "!" + " I hope that's per hour and not year! LOL!");
        }
    
}
