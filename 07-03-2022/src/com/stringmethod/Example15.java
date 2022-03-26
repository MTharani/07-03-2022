package com.stringmethod;

public class Example15 {

	public static void main(String[] args) 
	{
		/**split(String regex)
		*Splits this string around matches of the given regular expression.
		*/
		String s= "I like New York";
		String s1[]= s.split("\\s");
		for(String s2: s1)
		{
			System.out.println(s2);
		}
		
	}

}
