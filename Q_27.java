/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_27 {
    public static void main( String[] args )
	{
            int count = 0;
            String response ;
            Scanner sc = new Scanner(System.in);
            System.out.print("Are you ready for a quiz? ");
            response = sc.next();
            if (response.equals("Y"))
            {
                System.out.println("Ok, here it comes");
                System.out.println("Q1) What is the capital of Alaska? \n\t1)Melbourne\n\t2)Anchorge\n\t3)Juneau");
                
                if(sc.next().equals("3"))
                        {
                            System.out.println("That's right!");
                            count++ ;
                        }
                
                System.out.println("Q2) Can you store the value \"cat\" in a variable of type int? \n\t1)yes\n\t2)no");
                
                if(sc.next().equals("1"))
                        {
                            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
                        }
                else 
                        {
                            count++ ;
                        }
                
                System.out.println("Q3) What is the result of 9+6/3? \n\t1)5\n\t2)11\n\t15/3");
                
                if(sc.next().equals("2"))
                        {
                            System.out.println("That's correct!");
                            count++;
                        }
                
            }
            else
            {
                System.out.println("Bye");
            }
            
            System.out.println("Overall, you got " + count + " out of 3 correct.\nThanks for playing!");
            
        }
    
}
