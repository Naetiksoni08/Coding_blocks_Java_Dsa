package blind_45_days_sheet;

public class construct_uniform_parity_array_1 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3 };
		System.out.println(true); // yes this is the code bro
	}
}

//🎯 Problem ko simplify kar
//Har index pe tumhare paas 2 choices hain:
//Same number rakh lo
//Kisi aur number se subtract karo
//👉 Goal: sab elements same parity (all odd / all even)
//🧠 Core Observation
//Subtraction ka parity rule:
//even − even = even
//odd − odd = even
//even − odd = odd
//odd − even = odd
//👉 Matlab:
//Same parity → EVEN
//Different parity → ODD
//🔥 Ab proof dekh (3 cases)
//✅ Case 1: All EVEN
//Example:
//[2, 4, 6]
//👉 Sab already even
//👉 Operation 1 use karo (keep as it is)
//✔ Done → true
//✅ Case 2: All ODD
//Example:
//[3, 5, 7]
//👉 Sab already odd
//👉 Operation 1 use karo
//✔ Done → true
//✅ Case 3: MIX (Even + Odd)
//Example:
//[2, 3, 6]
//👉 Ab trick aati hai 👇
//Pick any one odd element, maan lo 3
//Ab:
//2 − 3 = -1 → odd
//3 → already odd
//6 − 3 = 3 → odd
//👉 Sabko odd bana diya
//✔ Done → true