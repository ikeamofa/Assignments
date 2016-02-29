/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_19 {
     public static void main( String[] args )
	{
            double fnum,snum,tnum ;
            Scanner sc = new Scanner(System.in) ;
            
            System.out.print("What is your first number? ");
            fnum = sc.nextDouble();
            
            System.out.print("What is your second number? ");
            snum = sc.nextDouble();
            
            System.out.print("What is your third number? ");
            tnum = sc.nextDouble();
            
            System.out.println("( 1.1 + 2.2 + 5.5 ) / 2 is... " + (fnum+snum+tnum)/2);
            
            
            
            
        }
    
}
