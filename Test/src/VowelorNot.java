/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelornot;

/**
 *
 * @author GOVIND
 */
public class VowelorNot {

 
         public static void main(String[] args) 
     { 
         char ch='a'; 
         
         switch(ch) 
             { 
                    case 'a': case 'A': 
                    case 'e': case 'E': 
                    case 'i': case 'I': 
                    case 'o': case 'O': 
                    case 'u': case 'U': 
                                 System.out.println( ch + " is Vowel"); 
                                             break;  
                    default: 
                                System.out.println( ch + " is not Vowel"); 
             } 
                               
       } 
} 

