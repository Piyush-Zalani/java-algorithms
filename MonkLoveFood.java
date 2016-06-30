package com.hackerEarth.StackQueue;

import java.util.ArrayList;
import java.util.Scanner;

public class MonkLoveFood {

	public static void main(String args[]) throws Exception {

		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();
		int N = Integer.parseInt(line);

		ArrayList<Long> v = new ArrayList<Long>();

		for (int j = 0; j < N; j++) {

			String[] e = scn.nextLine().split(" ");

			long[] n = new long[e.length];

			for (int i = 0; i < e.length; i++) {
				n[i] = Long.parseLong(e[i]);
			}

			if (n[0] == 1) {
				if (!v.isEmpty()) {
					System.out.println(v.get(v.size() - 1));
					v.remove(v.size() - 1);
				} else
					System.out.println("No Food");

			} else {
				v.add(n[1]);
			}

		}
		scn.close();
	}
}
