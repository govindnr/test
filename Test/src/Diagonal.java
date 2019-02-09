
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.


import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class Diagonal {
   

 public static void main(String[] args)
{
 String s;
 String space="";
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a string");
 s=sc.nextLine();
 int len=s.length();
 

 
 
 /* FROM TOP TO BOOTOM                        G
  *                                           O
  *                                           V
  *                                           I
  *                                           N
  *                                           D
  * 
  * 
  * 
  */
 
 for(int i=0;i<=len;i++)
 {
      
    
  //System.out.println(s.charAt(i)); 
     for(int j=0;j<=i;j++)
         
     {
         
        // System.out.println(s.charAt());
         System.out.print("");
         //System.out.println(s.charAt(i));
     }  
     
    
     
 System.out.println(s.charAt(i));
 
 //System.out.print("\n");
}
 /* FROM BOTOM TO TOP                                   D
  *                                                     N
  *                                                     I
  *                                                     V
  *                                                     O
  *                                                     G
 
 */
 
 
 
 
 for(int i1=len-1;i1>=0;i1--)
 {
      
    
  //System.out.println(s.charAt(i)); 
     for(int j=len;j<=i1;j++)
         
     {
         
        // System.out.println(s.charAt());
         System.out.println("");
         //System.out.println(s.charAt(i));
     }  
     
    
     
 System.out.println(s.charAt(i1));
 
 //System.out.print("\n");
}
 
 
 
 
  /* FROM LEFT TO RIGHT                  G
                                          O
                                           V
                                            I
                                             N
                                              D
 
 */
 
 for(int i=0;i<=len;i++)
 {
      
    
  //System.out.println(s.charAt(i)); 
     for(int j=len;j<=i;j++)
         
     {
         
        // System.out.println(s.charAt());
         System.out.print(" ");
         //System.out.println(s.charAt(i));
     }  
     
    
     
 System.out.println(s.charAt(i));
 
 //System.out.print("\n");
}
 
 /*FROM RIGHT TO LEFT                         G
  *                                          O
  *                                         V
  *                                        I
  *                                       N
  *                                      D
  */
 
 
 
 
 
 for(int i=0;i<=len;i++)
 {
      
    
  //System.out.println(s.charAt(i)); 
     for(int j=1;j<=len-i;j++)
         
     {
         
        // System.out.println(s.charAt());
         System.out.print(" ");
         //System.out.println(s.charAt(j));
     }  
     
    
     
 System.out.println(s.charAt(i));
 
 //System.out.print("\n");
}
 
 
 /*FROM RIGHT TO LEFT IN REVERSE                                D
  *                                                            N
  *                                                           I
  *                                                          V
  *                                                         O
  *                                                        G
  */
 for(int i=len-1;i>=0;i--)
 {
      
    
  //System.out.println(s.charAt(i)); 
     for(int j=1;j<=i;j++)
         
     {
         
        // System.out.println(s.charAt());
         System.out.print(" ");
         //System.out.println(s.charAt(j));
     }  
     
    
     
 System.out.println(s.charAt(i));
 
 //System.out.print("\n");
}
 
 
 
 
 /*FROM LEFT TO RIGHT IN REVERSE                          D
  *                                                        N
  *                                                         I
  *                                                          V
  *                                                           O
  *                                                            G
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  */
 for(int i=len-1;i>=0;i--)
 {
      
    
  //System.out.println(s.charAt(i)); 
     for(int j=1;j<=len-i;j++)
         
     {
         
        // System.out.println(s.charAt());
         System.out.print(" ");
         //System.out.println(s.charAt(j));
     }  
     
    
     
 System.out.println(s.charAt(i));
 
 //System.out.print("\n");
}
}
}

