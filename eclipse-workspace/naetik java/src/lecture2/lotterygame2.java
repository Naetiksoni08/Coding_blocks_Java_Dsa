package lecture2;

public class lotterygame2 {

	public static void main(String[] args) {
		int number;
		number = 350;
		if(number >= 300 && number<=400) {
			System.out.println("you won thar!!");
		}
		else if(number >= 401 && number<=500) {
			System.out.println("you won creta!!");
		}
		else if ( number >= 10 && number <=12) {
			System.out.println("you won m2 !!");
		}
		else if ( number >= 13 && number <=15) {
			System.out.println("you won m1 !!");
		}
		
		else if ( number >= 40 && number<=50) {
			System.out.println("you won mirci!!"); 
		}
		else if(number>=1000 && number<=1100) {
			System.out.println("you won red chips!!");
		}
		else if(number>=1101 && number<=1200) {
			System.out.println("you won red chips!!");
		}
		
		else if(number>=16 && number<=20) {
			System.out.println("you won ladybird!!");
		}
		else if(number>=21 && number<=25) {
			System.out.println("you won manbird!!");
		}
		else {
			System.err.println("happy birthday");
		}

	}


}
