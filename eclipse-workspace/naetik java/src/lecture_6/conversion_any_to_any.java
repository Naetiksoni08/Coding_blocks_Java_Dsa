package lecture_6;
import java.util.Scanner;

public class conversion_any_to_any {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: source base, destination base, and the number in source base
        int sb = sc.nextInt(); // Source base (sb)
        int db = sc.nextInt(); // Destination base (db)
        int sn = sc.nextInt(); // The number in source base (sn)

        // Step 1: Convert the number from source base to base 10 (decimal)
        int decimalValue = convertToDecimal(sn, sb);

        // Step 2: Convert the decimal number to the destination base
        String resultInDb = convertFromDecimal(decimalValue, db);

        // Output the result in the destination base
        System.out.println(resultInDb);
    }

    // Method to convert a number from source base (sb) to decimal (base 10)
    public static int convertToDecimal(int number, int sb) {
        int sum = 0;
        int power = 0;

        while (number > 0) {
            int remainder = number % 10;
            sum += remainder * Math.pow(sb, power);
            number /= 10;
            power++;
        }
        return sum;
    }

    // Method to convert a decimal (base 10) number to destination base (db)
    public static String convertFromDecimal(int decimalValue, int db) {
        if (decimalValue == 0) return "0"; // Handle the special case where number is 0

        StringBuilder result = new StringBuilder();

        while (decimalValue > 0) {
            int remainder = decimalValue % db;
            result.insert(0, remainder); // Insert remainder at the beginning (build number in reverse)
            decimalValue /= db;
        }

        return result.toString();
    }
}

