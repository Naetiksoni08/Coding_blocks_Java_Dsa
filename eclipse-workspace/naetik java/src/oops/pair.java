package oops;

public class pair<T, C> {
	T x;
	C y;

	public pair(T x, C y) {
		this.x = x;
		this.y = y;
	}

	public T getx() {
		return x;
	}

	public C gety() {
		return y;
	}

	public static void main(String[] args) {
		pair<Integer, Boolean> p = new pair<>();
		pair<Character, Boolean> p1 = new pair<>();
	}

}
