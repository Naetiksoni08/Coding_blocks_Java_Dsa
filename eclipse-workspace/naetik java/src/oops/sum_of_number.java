package oops;

public class sum_of_number {
	// this is called method overloading ..method overloading happens
	// in the same class method return type and method name is same,same class but
	// the argument or parameter is different

	public static void main(String[] args) {
		System.out.println(Add(2, 3));
		System.out.println(Add(2, 3, 5));
		System.out.println(Add(2, 3, 8.9));
		System.out.println(Add(2, 3, 4, 5, 6, 7, 8, 8, 9, 5, 6, 8, 8,5,5,5,9));
	}

	public static int Add(int a, int b) {
		return a + b;
	}

	public static int Add(int a, int b, int c) {
		return a + b;
	}

	public static int Add(int a, int b, double c) {
		return (int) (a + b + c);
	}
//triple dot argument 
	public static int Add(int x,int... ar) { // this creates a array it is used when we do not know the size of argument
										// passed by the user this ar is a variable it can be anything
		// when we do not know addition mai kitne data will come
		//int is the kis type ka data 
		// triple dot argument can only be one in the method and it should be passed at the end of the parameter or argument
		// that means we can not write like this int ...ar,int x (this is wrong)  we can write like this int x,int...ar this means that 2 jo hai voh x mai aah jayega baki all the numbers except 2 will get print 
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum+=ar[i];
			

		}
		return sum;
	}

}
