/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class SumOfDegits {

   
     public static void main(String[] args) throws IOException {
         
          int num,sum=0,r;
          System.out.println("Enter a number:");
          Scanner sc =  new Scanner(System.in);
          num = sc.nextInt();
          while(num!=0){
              r=num%10;
              num=num/10;
              sum=sum+r;
          }

          System.out.println("sum= "+sum);
     }
}

