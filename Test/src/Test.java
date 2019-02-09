/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author GOVIND
 */
public class Test {

	public static void main(String args[]) throws IOException
	{
		try {
			//FileInputStream fis = new FileInputStream("file1.txt");
			PrintWriter pw = new PrintWriter("D:\\file2.txt");
			BufferedReader br = new BufferedReader(new FileReader("D:\\file1.txt"));
			String line = "";
			ArrayList al = new ArrayList();
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(line!=null){
				al.add(line);
				line=br.readLine();
			}
			System.out.println(al);
			Collections.sort(al,new MyComparator());
			for(Object lines:al)
			{
				
				pw.write(lines.toString());
			}
			pw.flush();
			br.close();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
      class MyComparator implements Comparator{
    	  public int compare(Object o1,Object o2){
			String s1=o1.toString();
			String s2=o2.toString();
    		  return s2.compareTo(s1);
    	  }
      }

