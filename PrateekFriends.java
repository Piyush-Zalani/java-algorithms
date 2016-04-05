package com.hackerEarth.StringAndArray;


import java.util.Scanner;

public class PrateekFriends {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int testCase = scn.nextInt();

		for (int t = 0; t < testCase; t++) {
			int friends = scn.nextInt();

			long money = scn.nextLong();
			
			long cost[] = new long[friends];
			
			for (int i = 0; i < friends; i++) {
				cost[i] = scn.nextInt();
			}

			int low = 0;
			long total = 0;
			boolean found = false;
			//for(int hi=0;hi<friends;) {
			int hi = 0;
			while(total != money) {
				while(total > money) {
					total -= cost[low];
					low++;
				}
		
				while (total < money && hi < friends) {
					total += cost[hi];
					hi++;
				}
				
				if(total < money && hi == friends) {
					break;
				}
				
				if(total == money) {
					found = true;
					break;
				}
			}
			
			System.out.println(found?"YES":"NO");
		}
		scn.close();
	}

}
