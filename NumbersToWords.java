/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ysh;

/**
 *
 * @author gygshwr
 */
import java.util.Scanner;
public class NumbersToWords {
    public static void main(String[] arg)
    {
        int number;
        int dig;
        int count = 0;
        int[] numberTrans = new int[20];
        String[] array = new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        Scanner y = new Scanner(System.in);
        System.out.println("Number:");
        number = y.nextInt();
        System.out.println("Number:");
        
        while(number>0)
        {
            dig = number%10;
            numberTrans[count] = dig;
            number = number/10;
            count++;
            
        }
        
        for(int i=count-1;i>=0;i--)
        {
            System.out.print(" "+array[numberTrans[i]]);
        }
    }
    
}
