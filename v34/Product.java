/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop.v33;

/**
 *
 * @author User
 */
public class Product { 
  private String name;
  private String description;
  private float price;
  private int quantity;      
  private float discount;        
   private String color;
   public Product(){
   this.name= "No name";
   this.description="No description";    
   this.price=0.0f;
   this.quantity=0;
   this.discount=0.0f;     
       System.out.println("constructor 0");
   }
   public Product(String n,String d,float p,int q,float ds){
    this.name= n;
   this.description= d;    
   this.price= p;
   this.quantity= q;
   this.discount= ds;   
        System.out.println("constructor 5 ");
   }
   public Product(String n,String d,float p,int q,float ds,String c){
this(n,d,p,q,ds);
this.color=c;
 System.out.println("constructor 6");
        }
   
   public void display(){
       System.out.println("name ="+name);
       System.out.println("description"+description);
       System.out.println(" price="+ price);
       System.out.println("quantity="+quantity);
       System.out.println("discount="+discount);
       System.out.println("color="+color);
       
   }
   
          }
