package com.practice.git;

public class Example {
//Print numbers from 1 to 100 without any loop
	
	public static void m1 (int num) {
	
		if(num <= 100) {
			System.out.println(num);
			m1 (num+1);
		}
	}

	public static void main(String[] args) {
		
		m1(1);

	}

}
