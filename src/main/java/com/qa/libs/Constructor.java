package com.qa.libs;

public class Constructor {
public int i,k,j;
	Constructor()
	{
		System.out.println("I am inside default constructor");
	}
	
	public Constructor(int m)
	{
		m = i;
		System.out.println("I am inside single parameter constructor");
		System.out.println(m);
	}
	
	private Constructor(int k, int j)
	{
		this.k = k;
		this.j = j;
	}
}

