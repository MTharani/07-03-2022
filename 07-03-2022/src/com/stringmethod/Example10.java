package com.stringmethod;

public class Example10
{

	public static void main(String[] args) 
	{
		/**	intern()
            Returns a canonical representation for the string object.
		 * 
		 */
		String s="java world";
		String s1=s.intern();
		System.out.println(s);
		System.out.println(s1);

	}

}
