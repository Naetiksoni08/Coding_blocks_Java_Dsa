package oops;

public class client_inheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		p obj  = new p();
		//case1
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun2();
//		
//		
		//case2
//		p obj = new c1();
//		System.out.println(obj.d); // this will give 2 as output not one because the object is of p not c 
//		System.out.println(obj.d2);
//		System.out.println(((c1) (obj)).d1); // ye nai chal raha kyuki obj ka type p hai so hum iski c se typecaste kar  denge 
//		System.out.println(((c1) (obj)).d);
//		obj.fun(); // jisko new kia hai uske blue print mai jaake check hoga ki voh method hai ya nai that is why c execute hua hai 
//		obj.fun2();
//		((c1) (obj)).fun1();
//		
//		//case 3 
//		c1 obj = new p(); // new p se sirf p will get a space inside heap jismai d and d2 will be stored why only p got the space because in the a case 2 c was inheriting p but here p is which is parent is not and cannot inherit the c class
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
		//complier error is much better than runtime error thats is why we dont use this case because this case will give run time error 
		
		
		//case--4
		c1 obj = new c1(); // this will give space to both c and p because c class inherit p class thats is why dono ko space milegi 
		System.out.println(obj.d);//1
		System.out.println(obj.d1); // 10
		System.out.println(obj.d2);//20
		System.out.println(((p) (obj)).d); // 2
		obj.fun(); 
     	obj.fun1();
     	obj.fun2();
     	((p) (obj)).fun(); // tab bhi c wala hi excute hoga because object bana hai c ka jisko new kia hai ussi ka chalega bhale hi type caste karlo 
     	
     	
		
	}
	

}
