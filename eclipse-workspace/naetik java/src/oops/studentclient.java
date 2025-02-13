package oops;

import java.util.ArrayList;

public class studentclient {

	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();
		student s = new student();// new student is the object it is a instance
		s.intro_yourself();
		s.name = "kaju";
		s.age = 28;
		s.intro_yourself();
		student s1 = new student();
		s1.name = "raj";
		s1.age = 21;
		s1.intro_yourself();
		s.sayhey("ramesh ");
		System.out.println(s.MentorName());
		System.out.println(student.MentorName());
		// non static will allow static method to call but not vice versa
		// and if we want to call a non static method in static method then we have to
		// create a object or instance

// class ka data member ko kese access karva sakte hai this keyword ke through aur agar same variable hp toh differenciate bhi this se hi karenge 
	}

}
// jab bhi kisi line par dot laga te hai toh uske joh address hai voh this keyword mai banta hai 
