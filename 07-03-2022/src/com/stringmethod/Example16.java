package com.stringmethod;

public class Example16 {

	public static void main(String[] args)
	{
		/**join(CharSequence delimiter, CharSequence... elements)
		*Returns a new String composed of copies of the CharSequence elements 
		*joined together with a copy of the specified delimiter.
         */
		String s= String.join(" ", "How are you", " I am fine");
		String s1= String.join("?", "How are you", " I am fine");
		System.out.println(s);
		System.out.println(s1);
	}

}
