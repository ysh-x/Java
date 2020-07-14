/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//This Program demonstrates the use of nested for loop to print a Pattern with number
package com.ysh;
import java.util.Scanner; // Scanner Package 

/**
 *
 * @author gygshwr
 */
public class ForLoopPattern {
    public static void main(String[] arg) {
        int number;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Number:");
        number = in.nextInt();
        
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
         for(int i=number;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        
    }
}
