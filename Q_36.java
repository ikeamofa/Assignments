/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_36 {
     public static void main( String[] args )
	{
            double height,weight ;
            Scanner sc = new Scanner(System.in) ;
            
            System.out.print("Your height in m: ");
            height = sc.nextDouble();
            
            System.out.print("Your weight in kg: ");
            weight = sc.nextDouble() ;
            
            double BMI = (weight)/(height*height) ;
            System.out.println("Your BMI is " + (weight)/(height*height));
            
            if(BMI < 18.5)
            {
                System.out.println("underweight");
            }
            if(BMI <= 18.5 && BMI >= 24.9)
            {
                System.out.println("normal weight");
            }
        
        }

}