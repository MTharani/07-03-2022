package com.stringmethod;

public class Example8 {

	public static void main(String[] args)
	{
		/**indexof(int ch)-
		*Returns the index within 
		*this string of the first occurrence of the specified character.
         */
		
		/**indexof((int ch, int fromIndex)
           *Returns the index within this string of the first occurrence 
            *of the specified character, starting the search at 
            *the specified index.
         */
		String s="welcome to karaikal";
		System.out.println(s.indexOf("e"));
		System.out.println(s.indexOf("e",3));
		System.out.println(s.indexOf("a",13));
	}
	
	

}
