/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop.v32;

/**
 *
 * @author User
 */
public class Circle {
  private double radius;
  
  public void setRadius(double radius){
      this.radius=radius;
  }
    public double getRadius(){
        return radius;
    }
      public double getArea(){
          return Math.PI *radius*radius;
      }
      public double getCircumference(){
          return 2*Math.PI*radius;
      }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
      
}
