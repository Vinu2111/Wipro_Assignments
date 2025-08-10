package com.rk;


interface greeting
{
	void greet();
	
	default void takeBreak()
	{
		System.out.println("you can take Break!");
	}

}	

class sayHello  implements greeting
{

	@Override
	public void greet() {
		System.out.println("good Mrng");
		
	}
	
}
public class WithoutLambda {

	public static void main(String[] args) {

		sayHello s1=new sayHello();
		s1.greet();
		
	}

}
