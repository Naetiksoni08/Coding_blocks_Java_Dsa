package lecture_6;
import java.util.*;
public class print_input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int cumulativeSum = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            cumulativeSum += num;

            if (cumulativeSum < 0) {
                break;
            }

            System.out.println(num);

	}

}
}
