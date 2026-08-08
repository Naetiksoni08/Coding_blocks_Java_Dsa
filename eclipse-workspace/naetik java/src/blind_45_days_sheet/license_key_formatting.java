package blind_45_days_sheet;

public class license_key_formatting {

	public static void main(String[] args) {
		String s = "5F3Z-2e-9-w";
		int k = 4;
		StringBuilder result = new StringBuilder();
		int count = 0; // current group mein kitne characters aaye
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i); // w aya

			if (c == '-') {
				continue;
			}

			if (count == k) {
				result.append('-');
				count = 0;
			}
			result.append(Character.toUpperCase(c));
			count++;
		}
		System.out.println(result.reverse().toString());

	}

}
// why from right because in the quesiton it is said ki first group joh hai usmai k sai kam character ho sakte hai but last mai nai hone chhaiye so thats why left sai start karunag toh possible hai ki right mai aate aate last ke group mai k character na bache isliye right to left taki last group mai agar kam bhi bache toh bhi koi prob nai hai 