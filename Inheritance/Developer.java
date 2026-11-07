/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Developer extends Employee {
   private String projectName;
   public Developer(){}

    public Developer(String projectName) {
        this.projectName = projectName;
    }

    public Developer( String name, String emailAddress, String phone, String department, String address, String yearofBirth,String projectName) {
        super(name, emailAddress, phone, department, address, yearofBirth);
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        
        return super.toString()+ "Developer{" + "projectName=" + projectName + '}';
    }
   
    
}
