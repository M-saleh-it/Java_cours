/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationshapes;

/**
 *
 * @author User
 */
public class Personallnformation {
private String firstName;
private String middleName;        
private String lastName;
private String bloodGroup;
private String accountNumber;        
private String nationality;
private int yearBirth; 

    public Personallnformation() {
    }

    public Personallnformation(String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearBirth = yearBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    @Override
    public String toString() {
        return "Personallnformation{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", bloodGroup=" + bloodGroup + ", accountNumber=" + accountNumber + ", nationality=" + nationality + ", yearBirth=" + yearBirth + '}';
    }


        
}
