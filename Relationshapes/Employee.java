/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationshapes;

/**
 *
 * @author User
 */
public class Employee {
  private int id;
  private float salary;
  private Personallnformation personalinfo;
  private Department dept;

    public Employee(int id, float salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearBirth, Department dept) {
        this.id = id;
        this.salary = salary;
        this.personalinfo  = new Personallnformation(firstName,middleName,lastName,bloodGroup,accountNumber,nationality,yearBirth);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + ", personalinfo=" + personalinfo + ", dept=" + dept + '}';
    }
  
}
