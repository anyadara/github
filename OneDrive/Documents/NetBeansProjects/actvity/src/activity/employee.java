/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity;

/**
 *
 * @author Msi
 */
import java.util.Scanner;
public class employee {
    Scanner input=new Scanner(System.in);
    final String dp="IT DEPARTMENT";
     private String name;
    private int age;
   public employee(String name,int age){
       this.name=name;
       this.age=age;
   }
    
    
    public  String getname(){
        return name;
    }
    
     public  int getage(){
        return age;
    }
     
      public void output(){
           System.out.println("name: "+getname());
  System.out.println("age: "+getage());
                   
      }   
        
     }
    
             

