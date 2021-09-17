/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeterofcircle;

import java.util.Scanner;

/**
 *
 * @author Gerome
 */
public class Perimeterofcircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     	 Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         
	 double r= s.nextDouble();
         
	 double  c=(22*2*r)/7 ;
      
	 System.out.println("Perimeter of Circle is: " +c);      
   }
}
    
    

