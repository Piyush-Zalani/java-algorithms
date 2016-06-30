package com.infobeans;

public class Cadbury {

	public static void main(String[] args) {
		cadbury(5, 6, 3, 4);

	}

	public static int cadbury(int input1, int input2, int input3, int input4) {
		int count = 0;
		int p = input1;
		int q = input2;
		int r = input3;
		int s = input4;

		for (; p != 0 ;) {
			if (p >= r) {

				p = p - r;
				count++;
			} else {
				r = r - p;
				count++;
			}
		}
		p = input1;
		q = input2;
		r = input3;
		s = input4;
		
		for (; p != 0;) {
			if (p >= s) {
				p = p - s;
				count++;
			} else {
				s = s - p;
				count++;
			}
		}
		p = input1;
		q = input2;
		r = input3;
		s = input4;
		

		for (; q != 0;) {
			if (q >= r) {
				q = q - r;
				count++;
			} else {
				r = r - q;
				count++;
			}
		}
		p = input1;
		q = input2;
		r = input3;
		s = input4;
		
		
		for (; q != 0;) {
			if (q >= s) {
				q = q - s;
				count++;
			} else {
				s = s - q;
				count++;
			}
		}
		
		return count;

	}

}
