package lecture4;

public class primefactorisation {

	public static void main(String[] args) {
		int  n = 378;
		int  i = 2;
	    while(i<=n) {   // 7<=7
	    	if(n%i==0) {
	    		System.out.println(i);
	    		n = n/i; // 189/2 no  so i++ 189/3 go on and the 63/3 yes go then 
	    	}else {      // 21/3 then go 7/3 no so i++ i++ i++ i++ so 7/7 = 1
	    		i++;
	    	}
		}
		

	}

}
