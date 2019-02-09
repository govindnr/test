/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class ArmStrongNumber {

 
   public static void main(String args[])
   {
      int n, sum = 0, temp, r;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number to check if it is an armstrong number");      
      n = in.nextInt();
 
      temp = n;
 
      while( temp != 0 )
      {
         r = temp%10;
        // System.out.println(temp%10);
         sum = sum + r*r*r;
         temp = temp/10; 
      }
 
      if ( n == sum )
         System.out.println("Entered number is an armstrong number.");
      else
         System.out.println("Entered number is not an armstrong number.");         
   }
}

