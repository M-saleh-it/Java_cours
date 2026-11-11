/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compar;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Comparative c1=new Comparative(7);
        Comparative c2=new Comparative(5);
        if(c1.equals(c2)){
            System.out.println("c1=c2");}
        else{
            System.out.println("c1=!c2");
        }
    }
}
