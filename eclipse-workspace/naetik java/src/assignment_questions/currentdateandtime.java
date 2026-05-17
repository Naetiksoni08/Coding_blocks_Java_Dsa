package assignment_questions;

import java.text.SimpleDateFormat;
import java.util.*;

public class currentdateandtime {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String formattedDate = formatter.format(now);
		 System.out.println("Current Date and Time: " + formattedDate);
	}

}
