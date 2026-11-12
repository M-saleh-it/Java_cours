/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationshapes;

/**
 *
 * @author User
 */
public class Department {
  private int depNo;
private String depName;

    public Department() {
    }

    public Department(int depNo, String depName) {
        this.depNo = depNo;
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" + "depNo=" + depNo + ", depName=" + depName + '}';
    }

}
