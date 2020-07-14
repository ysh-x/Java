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
public class FibonacciSeries {
     public static void main(String[] arg){
        int number;
        int count = 0;
        int n1=1, n2=1, n3;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Number:");
        number = in.nextInt();
        
        System.out.print("1 1");
        for(int i=2;i<number;++i)  
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
 }  
        
    }
}