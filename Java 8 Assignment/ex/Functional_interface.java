package com.rk.ex;

@FunctionalInterface
interface Greeting
{
	void greet();
	//void run();
	
}

public class Functional_interface {

	public static void main(String[] args) {
     
		
		Greeting g= ()->System.out.println("good Mrng");
		g.greet();
	}

}
