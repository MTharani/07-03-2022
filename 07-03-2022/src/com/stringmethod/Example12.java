package com.stringmethod;

public class Example12 {

	public static void main(String[] args) 
	{
		
           /**	lastIndexOf(int ch):
            * Returns the index within this string of the 
            * last occurrence of the specified character.
            */
		String s="hello, how are you, I am fine";
		System.out.println(s.lastIndexOf("am fine"));
		System.out.println(s.lastIndexOf("hello"));
	}

}
