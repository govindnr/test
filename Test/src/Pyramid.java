/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class Pyramid {

    public static void main(String arg[])
{
        int i,j,k,l;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
            System.out.print("*");
            }
            for(l=1;l<=i;l++)
            {
                System.out.print("*");
            }

        System.out.print("\n");
    }
    }


}
