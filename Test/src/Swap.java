/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author GOVIND
 */

 
/**
 * @author Crunchify.com
 */
public class Swap {

    public static void m1(int a, int b){
        System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
 
        //swapping value of two numbers without using temp variable
        a = a + b; //now a is 50 and b is 20
        b = a - b; //now a is 50 but b is 20 (original value of a)
        a = a - b; //now a is 30 and b is 20, numbers are swapped
 
        System.out.println("Result Method1 => a: " + a +" b: " + b);
 
    }
 
    public static void m2(int c, int d){
        System.out.println("\nvalue of c and d before swapping, c: " + c +" d: " + d);
 
        //swapping value of two numbers without using temp variable using multiplication and division
        c = c+d; 
        d = c-d; 
        c = c-d; 
 
        System.out.println("Result Method2 => c: " + c +" d: " + d);
 
    }
 

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 3;
        int d = 4;
 Swap s=new Swap();
 s.m1(a, b);
 s.m2(c, d);
       // Swap.m1(a, b);
        //Swap.m2(c, d);
 
    }

    
 
}
