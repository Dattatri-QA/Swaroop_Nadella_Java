package Day_05;

public class LargeNumberOfThree {

	public static void main(String[] args) {

		int a = 1000, b = 11000, c = 3000;

		if (a > b && a > c) {
			System.out.println("A is the Largest value");
		} else if (b > a && b > c) {
			System.out.println("B is the Largest value");
		} else {
			System.out.println("C is the Largest value");
		}
	}

}
