/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class ExponentOfNumber {

    public static void main(String arg[])
    {
        int c=1,i;
        System.out.print("Enter the 1st no:  ");
        Scanner S1=new Scanner(System.in);
        int a;
        a=S1.nextInt();
        System.out.print("Enter the 2nd no:  ");
        Scanner S2=new Scanner(System.in);
        int b;
        b=S1.nextInt();   
        for(i=0;i<a;i++)
        {
            c=c*a;
           
        }
        System.out.print("Result is:  ");
            System.out.print(c);


    }


}
