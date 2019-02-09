/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class PrimeNumber {
public static void main(String args[])
	{		
		int n, i, res=0;
		//boolean  flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
	
                n=scan.nextInt();
		for(i=2;i<n;i++)
		{
                    System.out.println(i);
			res=n%i;
                        System.out.println(res);
                       
			if(res==0)
			{
                            
				break;
                        }
                }
		if(res==1)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	
        }
        
}
      
