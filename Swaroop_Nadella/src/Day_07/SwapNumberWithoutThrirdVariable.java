package Day_07;

public class SwapNumberWithoutThrirdVariable {

	public static void main(String[] args) {

		int a = 10, b = 50;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Swapped Numbers : " + "a: " + a + " b: " + b);

	}

}
