/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ysh;
import java.util.Scanner;

/**
 *
 * @author gygshwr
 */
public class Factorial {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int number;
        int fact = 1;
        
        System.out.println("NUMBER: ");
        number = in.nextInt();
        
        for(int i=1;i<=number;i++)
        {
            fact = fact * i;
        }
        System.out.println("FACTORIAL: "+fact);
        
    }
}
