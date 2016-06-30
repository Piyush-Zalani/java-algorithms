package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {



		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int mult = 1;
		
		int arr[] = {2,3,5,7};
		List<Integer> l = new ArrayList<Integer>(); 
		
		for(int i = 0; i<4; i++ ){
			if (n%arr[i]==0){
				l.add(arr[i]);
			}
		}
		System.out.print("Divisor is ");
		for(int j : l){
			System.out.print(j + " ");
			mult = mult * j;
			
			
		}
		System.out.println();
		System.out.println("Multiplication of Divisor is " + mult);
		scn.close();
	}

}
