/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.javacoderanch.example.commons.lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GOVIND
 */
public class ReverseWordsOfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //int count=1;
        
        
        
   //     REMOVING VOWELS FROM STRING
        
        
        /*
 String l = "MANIkandan";
String k = l.replaceAll("[aeiouAEIOU]", "");
System.out.println(k);
         */
         
        /*
        
        int[] array = {29, 42, 1, 32, 44, 49, 0, 13, 43, 30};
int largest = array[0], index = 0;
for (int i = 1; i < array.length; i++) {
  if ( array[i] > largest ) {
      largest = array[i];
      index = i;
  }
      
   }
System.out.println(largest);
      System.out.println(index);*/
        
     
        
        
        /*
        String sentence = "The quick fox."; //IO.readLine().toString();  
        sentence = sentence.trim();  
        sentence = sentence.toLowerCase();  
        String word="";  
        String newsentence="";  
        sentence=sentence.replace(".", " ");  
        for (int i=0;i<sentence.length();i++){  
            char c=sentence.charAt(i);  
            if (c!=' ')  
                word+=c;  
            else{  
                if ("".equals(newsentence)) c='.';  
                newsentence=word+c+newsentence;  
                word="";  
            }  
        }  
          
        System.out.println(newsentence);
         * 
         * 
         * 
         * 
         */
        
        
            String str[] = "He is the one".split(" ");
    String finalStr=" ";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    
    
       /* String s="govind good";
        String s1[]=s.split(" ");
        int len=s.length();
        String f="";
        for(int i=len-1;i>=0;i--)
        {
            f+=s1[i]+" ";
        }
        System.out.println(f);
        */
    }
}
