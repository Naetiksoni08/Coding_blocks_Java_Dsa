package lecture2;

public class gradecard {

	public static void main(String[] args) {
		int m = 25;
		if(m>=75) {
			System.out.println('A');
		}
		else if (m>=65 && m<75) {
			System.out.println('B');
			
		}
		else if (m>=55 && m<65) {
			System.out.println('C');
		}
		else if(m>=45 && m<55) {
			System.out.println('D');
		}
		else if (m>=35 && m<45) {
			System.out.println('E'); 	
		}
		else {
			System.out.println("FAIL");
		}
		

	}

}
