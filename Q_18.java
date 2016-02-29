/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_18 {
     public static void main( String[] args )
	{
            String name;
            int age;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Hello. What is your name? ");
            name = sc.next();
            
            System.out.print("Hi, " + name + "!  How old are? ") ;
            age = sc.nextInt();
            
            int plus5 = age + 5, minus5 = age - 5;
            
            
            System.out.println("Did you know that in five years you will be " + plus5 + " years old?\nAnd five years ago you were " + minus5 +"! Imagine that!"  );
        }
    
}
