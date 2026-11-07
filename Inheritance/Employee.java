/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Employee {
    protected String name;
    protected String emailAddress;
    protected String phone;
    protected String department;
    protected String address;
    protected String yearofBirth;
    public Employee(){
        System.out.println("no parameter construator");
    }

    public Employee(String name, String emailAddress, String phone, String department, String address, String yearofBirth) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.department = department;
        this.address = address;
        this.yearofBirth = yearofBirth;
        System.out.println("parameter construatr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYearofBirth() {
        return yearofBirth;
    }

    public void setYearofBirth(String yearofBirth) {
        this.yearofBirth = yearofBirth;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", emailAddress=" + emailAddress + ", phone=" + phone + ", department=" + department + ", address=" + address + ", yearofBirth=" + yearofBirth + '}';
    }
    
    
}
