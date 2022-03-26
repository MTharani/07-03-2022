package com.stringmethod;

public class Example2 
{

	public static void main(String[] args)
	{
		// compareTo-Compares two strings lexicographically.
		String s="Good";
	    String s1="Good";
	    String s2="Afternoon";
	    String s3="evening";
	    String s4="good";
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s2.compareTo(s));
		//	compareToIgnorcase-Compares two strings lexicographically, ignoring case differences
		 System.out.println("************");
		 System.out.println(s3.compareTo(s2));
		 System.out.println(s4.compareTo(s));
		

	}

}
