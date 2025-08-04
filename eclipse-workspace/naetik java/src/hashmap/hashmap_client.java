package hashmap;

public class hashmap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String,Integer> map = new Hashmap();
		map.put("Ankit", 77);
		map.put("raj", 97);
		map.put("kunal", 87); // same value
		map.put("ankita", 57);
		map.put("kaju", 87); // value can be duplicate but key can not be duplicate //same value
		map.put("puneet", 67);
		map.put("ankita", 6);
		System.out.println(map.get("ankita"));
		System.out.println(map);

	}

}
