/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final_Variable;

/**
 *
 * @author User
 */
public class Student {
  private  final int ID;
   private String name;
   private int yearOfBirth;
final static float DEGREE_OF_SUCCESS;
static{DEGREE_OF_SUCCESS=50;}
    public Student() {
        this.ID = 3335;
    }

    public Student(int ID, String name, int yearOfBirth) {
        this.ID = ID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
   
    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + '}';
    }
  
}
