package com.ysh;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gygshwr
 */
public class ForLoop {
    public static void main(String[] arg)
    {
       int a = 0; // starting from 0 
       for(a=0;a<100;a++)
       {
           if(a%2!=0) // Checks if the number is odd or not
           {
               System.out.println(a); // Prints if the number is odd
           }
       }
    }
    
}
