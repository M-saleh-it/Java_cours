/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v35;

/**
 *
 * @author User
 */
public class Student{
 private String name;
 private String password;
 private int no;
 private static int count=1;
private boolean loggedIn;
private static String college="IT";
public Student(String name,String password){
    this.name=name;
    this.password=password;
    this.no=count;
    count++;
}
public boolean logIn(int enterdNo,String enterdPassword ){
    if(enterdNo==this.no&&enterdPassword.equals(this.password)){
        loggedIn=true;
        return true;
    }
    else{
        loggedIn=false;
        return false;
    }
}


}
