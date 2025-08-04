package comparator_comparable_interface;

public class cars { 
//	implements Comparable<cars>
	int price;
	int speed;
	String color;

	public cars() {

	}

	public cars(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	public String toString() {
		return "p " + price + " s " + speed + " c " + color;
	}

//	@Override
//	public int compareTo(cars o) {
////		return this.price - o.price;
////		return o.speed - this.speed;
//		return this.color.compareTo(o.color);
//
//	}

}
