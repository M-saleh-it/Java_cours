/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop.v32;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String args[]){
        
          Circle circle1 = new Circle(), circle2 =new Circle();
   circle1.setRadius(2.4);
   circle2.setRadius(5.7);
        System.out.println(circle1.toString());
        System.out.println("Circle area = "+circle1.getArea());
        System.out.println("Circle circumference = "+circle1.getCircumference());
        
}

    }
 