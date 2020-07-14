/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ysh;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gygshwr
 */
public class RollADice {
    public static void main(String[] arg) {
        Random R = new Random();
        Scanner in = new Scanner(System.in);
        
        int number;
        do {
            System.out.println("DICE ROLLED!!");
            System.out.println("YOU HAVE GOT "+R.nextInt(6));
            System.out.println("Press [0] to roll again! ");
            number = in.nextInt();
            System.out.print("YOU PRESSED "+number);
               
        }while(number==0);
        
    }
    
}
