package com.stringmethod;

public class Example6 {

	public static void main(String[] args)
	{
		// equals()-Compares this string to the specified object.
		String s1="Divi";
		String s2="study";
		String s3="study123";
		String s4="divi";
		String s5="study";
		System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s5));
        //equalIgnorcase()-Compares this String to another String, ignoring case considerations.
        System.out.println("**********");
        System.out.println(s1.equalsIgnoreCase(s4));
	}

}
