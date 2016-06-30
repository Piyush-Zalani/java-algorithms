package com.infobeans;

import java.util.Arrays;
import java.util.Scanner;

public class CrazyCrow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		int [ ]  number = new int [i];
		for(int m =0; m < i; m++){
			number[m] = scn.nextInt();
		}
		ThirstyCrowProblem(number,i,2);
	}
	
	public static int ThirstyCrowProblem(int[] input1,int input2,int input3)
	{
		int m =0;
		Arrays.sort(input1);
		int k = input1[input3-1];
		
		for(int i = input3-1; i >= 0;i-- ){
			int l = input1[input3-1] - input1[i];
			m += l;
		}
		int j = k * input1.length - m;
		System.out.println(j);
		return j;
		
	}
}
