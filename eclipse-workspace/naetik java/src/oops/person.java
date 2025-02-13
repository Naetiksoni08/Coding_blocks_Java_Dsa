package oops;

public class person {

	// TODO Auto-generated method stub
	String name = "kaju";
	int age = 21;

	public person() { // this is a constructor
		this.name = name;
		this.age = age;

	}

	public static void fun() {
		System.out.println("hello fun");
	}

	public String getname() {
		return this.name;

	}

	public static Object setName(String name) {
		return this.setName();
	}

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
