/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfhism;
//(String name, String address, String department, String email, float salary

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
          Employee E1 = new Employee("adm", "rknAlden", "IT", "adm@gmail", 1000);
    SalaridEmployee E2 = new SalaridEmployee(200, "adm", "rknAlden", "IT", "adm@gmail", 1000);
    DailyEmployee E3 = new DailyEmployee(20, 30, "ahmd", "aboRmaine", "IT", "ahmd@gmail", 0);
    HourlyEmployee E4=new  HourlyEmployee(20,5,"saleh","Barza","IT","saleh@gmail",0);
        System.out.println("E1="+E1.getSalary()); 
        System.out.println("E2="+E2.getSalary());
        System.out.println("E3="+E3.getSalary());
        System.out.println("E4="+E4.getSalary());
        //OR
        System.out.println("OR");
        Employee emp[] =new Employee[3];
        emp[0]=new  SalaridEmployee(200, "adm", "rknAlden", "IT", "adm@gmail", 1000);
        emp[1]=new DailyEmployee(20, 30, "ahmd", "aboRmaine", "IT", "ahmd@gmail", 0);
        emp[2]=new HourlyEmployee(20, 5, "saleh","Barza","IT","saleh@gmail", 0);
        for(int i=0;i<emp.length;i++){
            System.out.println(emp[i].getSalary());
        }
                    
                   

            }
}
