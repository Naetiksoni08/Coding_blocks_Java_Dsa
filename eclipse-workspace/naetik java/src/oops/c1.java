package oops;

//child class can access all the data member and variables of parent class but vice versa not 
public class c1 extends p { // inheritance
	int d = 1;
	int d1 = 10;
    @Override // used to  check if there is a mistake in the code or not it is a notation 
	public void fun() {
		System.out.println("fun in c");
	}

	public void fun1() {
		System.out.println("fun1 in c");
	}
}
