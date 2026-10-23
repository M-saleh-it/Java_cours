/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop.v33;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String args[]){
      Account account=new Account();
      account.insert(8706, "Ali khalia", 12000);
      account.deposit(2500);
      account.whithdraw(8700);
      account.chckBalance();
        System.out.println( account.toString());
       
        
    }
}
