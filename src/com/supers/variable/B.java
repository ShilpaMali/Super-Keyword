package com.supers.variable;

public class B extends A {
	int x = 20;

	void getData() {

		int x = 30;
		// scenario-1
		A a = new A();
		System.out.println("using object>>" + a.x);
		/*for single variable, we are loading entire 
		 * class into memory, bad approach 
		 */
		// scenario-2
		System.out.println("Using super keyword>>"+super.x);
		/*
		 * I am using super keyword so no need to load
		 * class into memory, good approach
		 */
	}

}
