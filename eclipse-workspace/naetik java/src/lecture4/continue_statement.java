package lecture4;

public class continue_statement {

	public static void main(String[] args) {
		for(int  i = 1 ; i<=5 ; i++) {
			if(i == 3) {
				continue;// continue helps to stop the particular if statement here 
	       // 3 wont get print because continue is present in the if statement 
			}
			System.out.println(i);
		}
	}
}		