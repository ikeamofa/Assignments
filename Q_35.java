/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_35 {
    public static void main( String[] args )
	{
            String response ;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Think of something and I'll try to guess it!");
            System.out.println("Question 1) Does it stay inside or outside or both?");
            String q1 = sc.next() ;
            
            System.out.println("Question 2) Is it a living thing?");
            String q2 = sc.next() ;
            
            if(q1.equals("outside") && q2.equals(("yes")))
            {
                System.out.println("Then what else could you be thinking of besides a python?!?");
            }
        }
    
}
