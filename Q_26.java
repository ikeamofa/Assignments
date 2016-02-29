/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_26 {
     public static void main( String[] args )
	{
            double weight;
            double m_weight,v_weight,j_weight,s_weight,u_weight,n_weight;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Please enter your current earth weight: ");
            weight = sc.nextDouble() ;
            
            m_weight = weight * 0.39 ;
            v_weight = weight * 0.78 ;
            j_weight = weight * 2.65 ;
            s_weight = weight * 1.17 ;
            u_weight = weight * 1.05 ;
            n_weight = weight * 1.23 ;
            
            double pWeight = 0 ;
            String p ;
            
            System.out.println("I have information for the following planets: ");
            System.out.println("\n1. Venus   2.Mars    3.Jupiter");
            System.out.println("\n4. Saturn  5.Uranus  6.Neptune");
            
            System.out.print("Which planet are you visiting? ");
            p = sc.next();
            if (p == "1")
            {
                pWeight = v_weight;
            }
            else if(p == "2")
              {
                  pWeight = m_weight ;
                        
              }
            else if(p == "3")
              {
                  pWeight = j_weight ;
                        
              }
            else if(p == "4")
              {
                  pWeight = s_weight ;
                        
              }
            else if(p == "5")
              {
                  pWeight = u_weight ;
                        
              }
            else if(p == "6")
              {
                  pWeight = n_weight ;
                        
              }
            System.out.println("Your weight would be " + pWeight + " pounds on that planet.");
        }
    
}
