/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class Fibonacci {

	public static void main(String args[])
	{		
		int prev, next, sum, n;
		prev=0;next=1;
                Scanner sc=new Scanner(System.in);
                System.out.println("enater a number");
                int number=sc.nextInt();
		for(n=1;n<=number;n++)
		{
			System.out.println(prev);
			sum=prev+next;
                       // System.out.println("the sum is"+sum);
			prev=next;
                       // System.out.println("the prev is"+prev);
			next=sum;
                       // System.out.println("the next is"+next);
		}
	}
}
      

