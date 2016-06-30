package com.hackerEarth.BitManipulation;
import java.util.Scanner;

class CountTheBits {
    public static void main(String args[] ) throws Exception {
       Scanner scn = new Scanner(System.in);
       int t = scn.nextInt();
       
       for (int i = 0; i<t; i++){
       		
       		int n = scn.nextInt();
       		int count = 0;
	        for (; n>0;)
		    {
		        n = n & (n-1);
		        count++;
			}
    		System.out.println(count);
       	
       }
       scn.close();
    }
}
