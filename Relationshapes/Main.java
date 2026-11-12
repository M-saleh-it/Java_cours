/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationshapes;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Department dep=new Department(3, "IT");
        Employee emp1=new Employee(1200, 2000, "Mohammed", "Saleh", "Sahweel", "AB+", "223", "Palestine", 2007, dep);
        System.out.println(emp1);
    }
}
