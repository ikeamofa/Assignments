/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_34 {
    public static void main( String[] args )
	{
            int age ;
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt() ;
            if(age < 16)
            {
                System.out.println("You can't drive");
            }
            if(age>= 16 && age <=17)
            {
                System.out.println("You can drive but not vote.");
            }
            if(age >= 18 && age <= 24)
            {
                System.out.println("You can vote but not rent a car.");
            }
            if(age >= 25)
            {
                System.out.println("You can do pretty much anything.");
            }
           
        }
    
}
