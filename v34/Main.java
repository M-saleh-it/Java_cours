/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop.v33;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String args[]){
     Product p1=new Product() ;
      Product p2=new Product("camera","Auto focus",99,10,5) ;
       Product p3=new Product("camera","Auto focus",99,10,5,"red") ;
     p1.display();
     p2.display();
     p3.display();
    }
}
