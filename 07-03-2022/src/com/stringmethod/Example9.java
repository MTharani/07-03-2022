package com.stringmethod;

public class Example9 {

	public static void main(String[] args) 
	{
		/**	indexOf(String str)
            *Returns the index within this string 
             *of the first occurrence of the specified substring.
        */
		
		/**  indexOf(String str, int fromIndex)
             Returns the index within this string of the first 
             occurrence of the specified substring, 
             starting at the specified index.
		 */
		String s= "I am Tharani, I am from karaikal";
		System.out.println(s.indexOf("am"));
		System.out.println(s.indexOf("am", 14));
	}

}
