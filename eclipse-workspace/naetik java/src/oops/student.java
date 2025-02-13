package oops;

public class student {

	String name;
	int age;

	public void intro_yourself() {
		System.out.println("My name is " + this.name + " and age is " + this.age);
	}

	static { // this is a static block it is a keyword
		System.out.println("this is a static block"); // this will run sabse phele kahi par bhi likh do sabse phele
														// print yehi hogo

	}

	public void sayhey(String name) {
		System.out.println(this.name + "say hello" + name);
	}

	public static String MentorName() {
		return "Monu bhaiya";
		// non static will allow static method to call but not vice versa
		// and if we want to call a non static method in static method then we have to
		// create a object or instance
	}
}
