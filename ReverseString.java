package com.hackerEarth.StringAndArray;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i=0; i<=T; i++) {
			String s = scn.nextLine();
			for (int j = s.length()-1; j>=0; j--) {
			char c = s.charAt(j);
			System.out.print(c);
			}
			System.out.println("");
		}
		scn.close();
	}
}
