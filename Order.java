/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
        int a=sc.nextInt(); 
        int k=1;
	for(int j=0;k<2*a;k++)	
        {int x=2*a-j;
	  if(a!=x) 
           {
             System.out.println(" "+k++ +"  "+"  "+x);  
              }		
	       }

    }
}
    

