/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class EENORODD {

 
    public static void main(String arg[])
    {
        int k;
       System.out.println("Enter the 1st no:");
       Scanner S1=new Scanner(System.in);
       int i = 0;
       i=S1.nextInt();
       System.out.println("Enter the last no:");
       Scanner S2=new Scanner(System.in);
       int j = 0;
       j=S2.nextInt();
       for(k=i;k<=j;k++)
       {
           System.out.print("No. is:  ");
           System.out.println( k );
       if(k%2==0)
       {
           System.out.println("No. is even");
       }
       else
       {
           System.out.println("No. is odd  ");
       }
    }
  }
}





