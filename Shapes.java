/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//A java project to implement classes
package com.ysh;
import java.util.Scanner;

/**
 *
 * @author gygshwr
 */


class Shape{
   
    Scanner in = new Scanner(System.in);
    private float length, breadth, radius, area;
    private final float pi = 3.14f;
    
    void circle() {
        System.out.println("Radius: ");
        radius = in.nextFloat();
        
        area = pi * radius * radius;
        System.out.println("Area of the circle: "+area);
    }
        void square() {
        System.out.println("Side: ");
        length = in.nextFloat();
        
        area = length * length;
        System.out.println("Area of the circle: "+area);
    }
    void rectangle() {
        System.out.println("Length: ");
        length = in.nextFloat();
        System.out.println("Breadth: ");
        breadth = in.nextFloat();
        
        area = length * breadth;
        System.out.println("Area of the Rectangle: "+area);
    }
    void triangle() {
        System.out.println("Length: ");
        length = in.nextFloat();
        System.out.println("Height: ");
        breadth = in.nextFloat();
        
        area = 0.5f * length * breadth;
        System.out.println("Area of the triangle: "+area);
    }
    
    
    
}
public class Shapes {
        public static void main(String[] arg) {
            Shape S = new Shape();
            Scanner in = new Scanner(System.in);
            
            int ch;

            System.out.println("Area\n1.Rectangle\n2.Square\n3.Triangle\n4.Circle");
            ch = in.nextInt();
            switch(ch) {
                         case 1:
                             S.rectangle();
                            break;
                         case 2:
                            S.square();
                            break;
                        case 3:
                            S.triangle();
                            break;
                        case 4:
                            S.circle();
                            break;
                        default:
                            System.out.println("Wrong Choice");
                    }
            
        }
              
}
