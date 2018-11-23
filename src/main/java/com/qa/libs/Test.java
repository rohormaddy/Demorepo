package com.qa.libs;

public class Test {

	public static void main(String[] args) {
		Constructor constr = null;
		constr = new Constructor();
		constr.i = 20;
		System.out.println(constr.i);
		Constructor constr1 = new Constructor(10);
		//Constructor constr2 = new Constructor(10,20);
	}

}
