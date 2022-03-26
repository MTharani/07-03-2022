package com.stringmethod;

public class Example7 {

	public static void main(String[] args) 
	{
		/** getbytes()-
         *Encodes this String into a sequence of bytes using
         ** the platform's default charset, storing the 
         *result into a new byte array.
         */
		
		String s="Welcome to java class";
		byte[] b1=s.getBytes();
		for(byte b: b1)
		{
			System.out.println(b);
		}
	}
	

}
