package com.stringmethod;

public class Example14 {

	public static void main(String[] args) {
		
		/**replace(CharSequence target, CharSequence replacement)
		*Replaces each substring of this string that matches the literal 
		*target sequence with the specified literal replacement sequence.
		**/
		
		String s= " welcome to India, Welocme to Puducherry";
		System.out.println(s);
		System.out.println(s.replace("India", "world"));
		System.out.println(s.replace("world", "india"));

	}

}
