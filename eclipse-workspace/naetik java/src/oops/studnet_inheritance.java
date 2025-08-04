package oops;

public class studnet_inheritance {
	String name = "kaju";
	int age = 18;
	@Override
	public String toString() {
		return name +" "+ age;
		
	}
	

}



// there is a thing called multiply level inheritance 
// in this what happens A-->b-->c-->d-->e  a, b ko inherit kar raha hai b c ko c d ko d e ko 
// toh e ke paas e ka access hoga d ke paas de c ke paas cde b ke paas bcde and a ke paas abcde
// for example we need to find to string method in these classes we will start from A nai mila then b then c then d suppose we found it in d then wahi se return hojayega 
// then next thing is multiple inheritance ek bache ke 2 baap 
// a class b ko bhi inherit kar raha hai and c ko bhi for example a ke andar we didnt find fun A then we will check in b and c ab b mai  jaye ya c mai this is not confirm that is why java does not allow multiple inheritance 