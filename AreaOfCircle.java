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
import java.util.Scanner;
public class AreaOfCircle {
    
  public static void main(String[] arg) {
      
      final float pi = 3.14159f;
      float area,r;
      
      Scanner y = new Scanner(System.in);
      System.out.println("Radius: ");
      r = y.nextFloat();
      area = pi*r*r;
      System.out.println("Area of circle: "+area);
      
  }
    
}
