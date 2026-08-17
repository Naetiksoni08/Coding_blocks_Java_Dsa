package blind_45_days_sheet;

public class power_of_three {
	public static void main(String[] args) {
		int n = 27;
//		if (n <= 0)
//			System.out.println(false);
//
//		while (n % 3 == 0) {
//			n /= 3;
//		}
//		System.out.println(n==1);
//	}
		System.out.println(n > 0 && 1162261467 % n == 0);
	} // simple hai n>0 for n = 0 case infinite loop ko avoid karne ke liye

	// core logic yeh hai ki humne with loop toh karlia ab hume follow up satisfy
	// karna tha which as do it without loop or recursion so dekh logic yeh hai ki
	// bhai
	// agar hum koi aisa number dundlete hai joh int ki range 2,147,483,647 sai just
	// chota ho aur 3 ki biggest power ki value ho toh agar n usss number sai divide
	// ho jata hai remainder == 0 aha jata hai toh voh number n bhi power of three
	// hoga

	// 3^18 = 387,420,489
	// 3^19 = 1,162,261,467 ← ye fit ho raha hai (2,147,483,647 se chota hai)
	// 3^20 = 3,486,784,401 ← ye overflow ho gaya (int range se bahar)

	// so 3^19 mil gaya so ab simple hai ki 3^19 ko divide karo with n agar == 0
	// then n bhi power of n hoga

	// exmaple
	// n = 27 mtlb 3^3 = (3*3*3 = 27)
	// 3^19 biggest no = 1162261467 so finally
	// 3^19 % 3^3 == if 0 then 27 is power of three
	// 1162261467 % 27 == 0 true

	// counter exmaple
	// n = 45 this is not power of three because 45 = 9 × 5 = 3^2 × 5

	// 1162261467 % 45 = not 0 so done
	
	// this trick works for only prime number jaise 2,3,5,7 etc composite mai it will fail because prime number ke factors sirf 1 and itself hote hai agar n = 7 hai toh 1,7 factor hai 
	// so sirf 2 factors composite ke liye fail kyu hua kyuki unn number ke factors over lap ho sakte hai jaise n = 8 hai toh 8 ke 1,2,4,8 itne sare factor hai 
	
	

}
