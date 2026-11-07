/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfhism;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee {

    private float workOurPrice;
    private int hourlyRate;

    public float getWorkOurPrice() {
        return workOurPrice;
    }

    public void setWorkOurPrice(float workOurPrice) {
        this.workOurPrice = workOurPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getSalary() {
        return workOurPrice * hourlyRate;
    }

    public HourlyEmployee(float workOurPrice, int hourlyRate, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.workOurPrice = workOurPrice;
        this.hourlyRate = hourlyRate;
    }

}
