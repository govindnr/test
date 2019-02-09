/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class AdditionOfTwoArrays {

    
    public static void main(String arg[])
    {
        int i,j,k;
        Scanner s1=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("Enter array A:");
        for(i=0;i<5;i++)
        {
            a[i]=s1.nextInt();
        }

        int b[]=new int[5];
        System.out.print("Enter array B:");
        for(j=0;j<5;j++)
        {
            b[j]=s1.nextInt();
        }
        int c[]=new int[5];
        System.out.println("Array is: ");
        for(k=0;k<5;k++)
        {
            c[k]=a[k]+b[k];
             System.out.println(c[k]);

        }
       
      
    }
}

