/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author User
 */
//31 classes and objects
public class Car {
    private String name;
     private int Maxspeed;
     private float price;
    private  int model;
    
  public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
  public void setMaxspeed(int Maxspeed) {
        this.Maxspeed = Maxspeed;
    }
  
    public int getMaxspeed() {
        return Maxspeed;
    }
 public void setPrice(float price) {
        this.price = price;
    }
  

    public float getPrice() {
        return price;
    }
  public void setModel(int model) {
        this.model = model;
    }
   

    public int getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", Maxspeed=" + Maxspeed + ", price=" + price + ", model=" + model + '}';
    }

  
    

}
