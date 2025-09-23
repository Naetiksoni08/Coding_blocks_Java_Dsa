package assignment_questions;

import java.util.*;

public class Sorting_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // this is the minimum salary
		int n = sc.nextInt(); // this is the no of employees
		sc.nextLine();
		List<Employee> ll = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine(); // read whole line, e.g., "Eve 78"
			String[] parts = line.split(" "); // now i got ["EVE" , "78"];
			String name = parts[0]; // now i got the name
			int salary = Integer.parseInt(parts[1]); // "78"-->78 kardia

			if (salary >= x) {
				ll.add(new Employee(name, salary)); // agar salary joh hai voh minimum salary sai greater hai ya equal
													// hai toh list mai add karde

			}
		}
		Collections.sort(ll, (e1, e2) -> {
			if (e2.salary != e1.salary) {// list is sorted in decreasing order of salary
				return e2.salary - e1.salary; // descending salary
			} else {
				return e1.name.compareTo(e2.name); // lexicographical by name sort karo
			}
		});

		for (Employee val : ll) {
			System.out.println(val.name + " " + val.salary);
		}

	}

	static class Employee {
		String name;
		int salary;

		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
	}

}
