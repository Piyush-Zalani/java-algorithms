package com.hackerEarth.BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetXOR {

	public static void main(String[] args) throws IOException {
		BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
		String line = scn.readLine();
		int t = Integer.parseInt(line);
		for (int i = 0; i < t; i++) {
			int num = Integer.parseInt(scn.readLine());
			String stri = scn.readLine();
			String str[] = stri.split(" ");
			if (num == 1) {
				System.out.println(str[0]);
			} else {
				System.out.println(0);
			}
		}
	}

}
