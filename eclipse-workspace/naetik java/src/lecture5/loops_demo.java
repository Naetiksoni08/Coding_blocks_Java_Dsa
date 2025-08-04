package lecture5;

public class loops_demo {

	public static void main(String[] args) {
	for(byte i= 0 ; i<128; i++) {
			System.out.println(i);
	}
		
	for(byte i = 0 ; i<=127; i++) {
		System.out.println(i);

	}

}
}

//ab kyu hua ye because i = 0 0 print hoga then value badegi i ki 1 hogai then
//ye loop chala 126 condition check hui 126<128 i ki value badi then 127 print hua
//ab 128 hote hi condition galat hojayegi and fir typecasting hogi kya hogi 
//(byte) (i+1) implicit typecasting now 128 ko binary mai kese likhte hai 
//10000000 so this number is negative so 2s compliment hoke -128 value ho jayegi 
//condition check hogi ki -128<128 so -128 se again loop chalega 
