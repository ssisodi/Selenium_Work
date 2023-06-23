package MethodChain;

public class Execution {

	public static void main(String[] args) {
		
		Pune a = new Pune(); 
		a.alpha().demo().test();// Method chaining
		
	}
}
/* Condition for Method Chaining
 * 1. Returntype of Method of sub class should have Class name of Super class 
 *
 *
 *
 *
 *
 * */
/*// Separately chaining all methods
		Delhi b = a.alpha(); 
		
		Mumbai c = b.demo();
		
		c.test();*/