package com.rk;

interface add2Number
{	
	 int add1(int x,int y);
}

public class SaticMethod_interface {

	public static void main(String[] args) {	
		add2Number a=(x,y)->x+y;
		System.out.print(a.add1(2, 5));
	}

}
