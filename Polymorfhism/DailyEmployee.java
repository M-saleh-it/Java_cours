/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfhism;

/**
 *
 * @author User
 */
public class DailyEmployee extends Employee {

    private float workDayprice;
    private int dilyRate;

    public float getWorkDayprice() {
        return workDayprice;
    }

    public void setWorkDayprice(float workDayprice) {
        this.workDayprice = workDayprice;
    }

    public int getDilyRate() {
        return dilyRate;
    }

    public void setDilyRate(int dilyRate) {
        this.dilyRate = dilyRate;
    }

    @Override
    public float getSalary() {
        return workDayprice * dilyRate;
    }

    public DailyEmployee(float workDayprice, int dilyRate, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.workDayprice = workDayprice;
        this.dilyRate = dilyRate;
    }

}
