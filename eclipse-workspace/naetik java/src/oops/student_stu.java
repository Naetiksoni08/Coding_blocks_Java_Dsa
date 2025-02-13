package oops;

public class student_stu {
	
		private String name = "kaju";
		private int age = 8;

		public student_stu() {
			// TODO Auto-generated constructor stub
		}

		public student_stu(String name, int age) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			try {
				if (age < 0) {
					throw new Exception("bklol age -ve nhi hoga");

				}
				this.age = age;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				System.out.println("I am finaly block");
			} // sabse phele ye this will work
		}
//		public void setAge(int age)throws Exception {
//			if (age < 0) {
//				throw new Exception("bklol age -ve nhi hoga");
//				
//			}
//			this.age = age;
//		}

	}