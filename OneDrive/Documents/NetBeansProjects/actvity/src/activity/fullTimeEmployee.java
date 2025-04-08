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
public class fullTimeEmployee extends employee {
    Scanner input=new Scanner(System.in);
    private int yearlysalary;
    public fullTimeEmployee(String name, int age,int monthsalary) {
        super(name, age);
        this.yearlysalary=monthsalary*12;
    }
    
    
    public double getyearlysalary(){
        return yearlysalary;
    }
    
    
    public void output(){
        System.out.println("***********************************");
        System.out.print("FULL TIME EMPLOYEE INFROMATION\n");
       super.output();
        
        System.out.println("department:"+super.dp);
           System.out.println("salary:"+getyearlysalary());
                      


                   
                      
    }
}
