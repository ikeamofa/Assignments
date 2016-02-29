/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_20 {
    public static void main( String[] args )
	{
            double height,weight ;
            Scanner sc = new Scanner(System.in) ;
            
            System.out.print("Your height in m: ");
            height = sc.nextDouble();
            
            System.out.print("Your weight in kg: ");
            weight = sc.nextDouble() ;
            
            System.out.println("Your BMI is " + (weight)/(height*height));
        }
    
}
