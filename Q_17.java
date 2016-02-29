/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_17 {
    public static void main( String[] args )
	{
            System.out.println("Please enter the following information so I can sell it for a profit!");
            
            String fname,lname,s_ID,l_ID ;
            int grade ;
            double gpa ;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("First name: ");
            fname = sc.next();
            
            System.out.print("Last name: ");
            lname = sc.next();
            
            System.out.print("Grade (9-12): ");
            grade = sc.nextInt();
           
            System.out.print("Student ID: ");
            s_ID = sc.next();
            
            System.out.print("Login: ");
            l_ID = sc.next();
            
            System.out.print("GPA (0.0-4.0): ");
            gpa = sc.nextDouble();
            
            System.out.println("Your information: ");
            
            System.out.println("\tLogin: " + l_ID);
            System.out.println("\tID: " + s_ID);
            System.out.println("\tName: " + lname + ", " + fname);
            System.out.println("\tGPA: " + gpa);
            System.out.println("\tGrade: " + grade);
            
            
            
            
        }
        
    
}
