package com.stringCode;

	import java.util.Scanner;
	public class LoveLetterMystery{
	    public static void main(String[] args){
	        Scanner scn = new Scanner(System.in);
	        int T = scn.nextInt();
	        
	        for(int i=0;i<T;i++){
	           
	            String str = scn.next();
	            char[] characters = str.toCharArray();
	            int m = 0;
	            int count = 0;
	            int n = characters.length-1;
	            while(m<n){
	                if(characters[m]!=characters[n]){
	                    int tmp = Math.abs(characters[m]-characters[n]);
	                    count = count+tmp;
	                }
	                m++;
	                n--;
	            }
	            System.out.println(count);
	        }
	        scn.close();
	    }
	}