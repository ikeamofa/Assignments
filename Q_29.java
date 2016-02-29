/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import javax.swing.JOptionPane;

public class Q_29 {
    public static void main( String[] args ) throws Exception
	{
            String name = JOptionPane.showInputDialog("What is your name?") ;
            String input = JOptionPane.showInputDialog("How old are you?") ;
            int age = Integer.parseInt(input) ;
            
            System.out.print("Hello, " + name + " ");
            System.out.println("Next year, you will be " + (age + 1));
            
            System.exit(0);

        }
    
}
