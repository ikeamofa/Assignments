/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_33 {
 public static void main( String[] args )
	{
            String fChoice,sChoice,tChoice ;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
"\"kitchen\"?");
            fChoice = sc.next() ;
            if(fChoice.equals("kitchen"))
            {
                System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
"there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
"or look in a \"cabinet\".");
            }
            
            System.out.println("");
            
            
        }    
}
