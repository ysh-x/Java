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
public class PrimeNumber {
    public static void main(String[] arg){
        int number;
        int count = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Number:");
        number = in.nextInt();
        
        for(int i=2;i<number/2;i++)
        {
            if(number%i==0)
            {
                count++;
            }
        }
        
        if(count==0)
        {
            System.out.println("The number is Prime");
        }
        else
        {
            System.out.println("The number is composite");
        }
        
    }
    
}
