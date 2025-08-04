package lecture_6;

public class fun_demo {
	 static int val  = 100; // global variable

	public static void main(String[] args) {
	 System.out.println("hello");
	 int a = 7;
	 int b = 12;
	 System.out.println(val); // 100
	 System.out.println(Add(a,b));
	 System.out.println(val);
	 

	}

	public static int Add(int a, int b) {
    int c = a+b;
    int val = 60;
    fun_demo.val = fun_demo.val+5;
    return c - sub(c,b);
	
	}

	public static int sub(int a, int b) {
		 int c = a-b;
		return c;
	}

}
