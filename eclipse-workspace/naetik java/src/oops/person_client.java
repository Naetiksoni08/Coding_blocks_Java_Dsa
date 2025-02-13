package oops;

public class person_client {

	public static void main(String[] args) {
		System.out.println("hello");
		person p = new person();
		person p1 = new person("raju", 23);
//		System.out.println(p.name);
//		System.out.println(p.age);
		p.setName("rajesh");
		System.out.println(p.getname());
//		

	}

}
