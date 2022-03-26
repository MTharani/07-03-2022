package com.stringmethod;

public class Example4 {

	public static void main(String[] args) {
		// contains()-Returns true if and only if this string contains the specified sequence of char values
		String s= "Java is a popular language";
		System.out.println(s.contains("is"));
		System.out.println(s.contains("IS"));
		System.out.println(s.contains("java"));

	}

}
