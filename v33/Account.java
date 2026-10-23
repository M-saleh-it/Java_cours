/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop.v33;

/**
 *
 * @author User
 */
public class Account {
    private int accountNo;
    private String name;
    private float amount;
    
   public void insert(int accountNo,String name,float amount){
      this.accountNo=accountNo;
       this.name=name;
       this.amount=amount;
       
   }
   public void deposit(float amount){
       this.amount+=amount;
       
   }
   public void whithdraw(float amount){
       if(this.amount>=amount){
             this.amount -=amount;    
       }
       else
           System.out.println("Insufficient Balan");
       
   }
   public void chckBalance(){
       System.out.println("amontis"+amount);
   }

    @Override
    public String toString() {
        return "Account Information{" + "accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + '}';
    }
   
}
