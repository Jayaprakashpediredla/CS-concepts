package com.phone;

public class Samp {
	Samp()
	{
		this("java");
		System.out.println("hello");
	}
	Samp(String s)
	{
		System.out.println("hello String "+s);
	}
	public static void main()
	{
		Samp s=new Samp();
	}
}