package com.hackerEarth.StringAndArray;


import java.util.Scanner;


class ConsicutiveLatters {
    public static void main(String args[] ) throws Exception {
        

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int i = 0; i < N; i++) {
        	char[] characters= scn.next().toCharArray();
        	
        	System.out.print(characters[0]);
        	for(int j=1;j<characters.length;j++)
        	{
        	  if(characters[j]!=characters[j-1])
        	  {
        	     System.out.print(characters[j]);	
        	  }
        		
        	}
        	System.out.println();
            
        }
        scn.close();
   
    }
}