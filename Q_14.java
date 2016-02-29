/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_14 {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
                int age;
                int feet, inches ;
                double weight;
                
                System.out.print("How old are you? ");
                age = keyboard.nextInt();
                
                System.out.print("How many feet are you? ");
                feet = keyboard.nextInt();
                
                System.out.print("And how many inches? ");
                inches = keyboard.nextInt();
                
                System.out.print("How much do you weigh? ");
                weight = keyboard.nextDouble();
                
                System.out.print("So, you,re " + age + " old, " + feet + "'" + inches +"\"" + " tall and " + weight + " heavy");
                
                
        }
    
}
