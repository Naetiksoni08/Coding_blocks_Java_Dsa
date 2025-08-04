package lecture2;

public class LOTTERY {

	public static void main(String[] args) {
		int number;
		number= 1200;
		if(number >= 200 && number<500) {
			System.out.println("you won car!!");
		}
		else if ( number >= 10 && number  <=15) {
			System.out.println("you won mac !!");
			
		}
		else if ( number >= 40 && number<=50) {
			System.out.println("you won mirci!!"); 
		}
		else if(number>=1000 && number<=1200) {
			System.out.println("you won chips!!");
		}
		else if(number>=16 && number<=25) {
			System.out.println("you won cycle!!");
		}
		else {
			System.err.println("happy birthday");
		}

	}

}
