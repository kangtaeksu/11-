package kosta_static;

public class Static {

	static int total;
	static int grandTotal;

	public static void add() {
		grandTotal += 10;
		total += 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
	}

}
