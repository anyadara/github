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
public class main {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);  
        parttimeemployee p=new parttimeemployee("helin",20,12);
        fullTimeEmployee f=new fullTimeEmployee("helin",20,2);

       System.out.println("1-fulltime\n2-parttime");
       int choose=input.nextInt();
      switch(choose){
          case 1:
              f.output();
              break;
          case 2:
             p.output();
             break;
      }
      
       
    }
}
