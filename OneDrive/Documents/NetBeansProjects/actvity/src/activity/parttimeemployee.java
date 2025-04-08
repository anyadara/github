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
public class parttimeemployee extends employee{
    
    Scanner input=new Scanner(System.in);
    private double salaryrate;

    public parttimeemployee(String name, int age,int workinghour) {
        super(name, age);
        this.salaryrate=workinghour*8;
        
    }
   
    public double getsalaryrate(){
        return salaryrate;
    
    }
    
    public void output(){
                System.out.println("***********************************");

        System.out.println("PART TIME EMPLOYEE INFROMATION");
        super.output();
                  System.out.println("department: "+super.dp);
                    System.out.println("salary: "+getsalaryrate());         
                    
    }
    
}
