/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author User
 */
public class Main {
    
 public static void main(String args[]){
Car c1=new Car();
c1.setName("tesla");
c1.setModel(2010);
c1.setPrice(7500);
c1.setMaxspeed(300);
     System.out.println("Car Name:"+c1.getName());
     System.out.println("Car Model:"+c1.getModel());
     System.out.println("Car Price:"+c1.getPrice());
     System.out.println("Max speed:"+c1.getMaxspeed());
     System.out.println(c1.toString());
    
    
 }
    
}
