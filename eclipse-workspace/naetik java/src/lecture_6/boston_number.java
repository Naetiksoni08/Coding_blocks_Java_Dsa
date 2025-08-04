package lecture_6;

import java.util.Scanner;

public class boston_number  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong(); // Input the number
        long primeFactorSum = primeFactorDigitsSum(number); // Get sum of digits of prime factors
        long digitSum = digitsum(number); // Get sum of digits of the number
        
        // Check if the sum of digits of the number equals the sum of digits of prime factors
        if (primeFactorSum == digitSum) {
            System.out.println(1); // Boston number
        } else {
            System.out.println(0); // Not a Boston number
        }
    }

    // Method to calculate the sum of the digits of a number
    public static long digitsum(long number) {
        long sum = 0;
        while (number > 0) {
            long remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        return sum;
    }

    // Method to find prime factors of a number and return the sum of their digits
    public static long primeFactorDigitsSum(long number) {
        long sum = 0;
        long factor = 2;

        // Divide the number by its smallest prime factors (starting from 2)
        while (factor <= number) {
            // If 'factor' divides 'number', it is a prime factor
            while (number % factor == 0) {
                // Add the sum of the digits of the prime factor
                sum += digitsum(factor);
                // Divide the number by this prime factor
                number /= factor;
            }
           
            factor++;
        }

        return sum;
    }
}
