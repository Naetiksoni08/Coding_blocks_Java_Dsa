package blind_45_days_sheet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tenth_line {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				count++;
				if (count == 10) {
					System.out.println(line);
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
