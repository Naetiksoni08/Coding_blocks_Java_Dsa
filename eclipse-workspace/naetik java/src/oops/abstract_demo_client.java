package oops;

public class abstract_demo_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		abstract_demo ab = new abstract_demo();
		// hum object nai bana sakte abstract ko kyuki unimplemented hai paym,ent ko
		// call karenege toh kuch hoga hi nai coz kuch hai hi nai payment mai
		phone_pay p = new phone_pay();
		abstract_demo p1 = new phone_pay();
		abstract_demo ab = new abstract_demo() {

			@Override
			public void payment() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		
	}

}
