package Day_06;

public class ForLoopExample {

	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println();
		for (int ii = 1; ii <= 10; ii += 2) {
			System.out.println(ii);
		}
		System.out.println();
		for (int j = 2; j <= 10; j += 2) {
			System.out.println(j);

		}
		System.out.println();
		for (int a = 1; a < 10; a++) {
			if (a % 2 == 1)
				System.out.println(a + " Odd");
			else
				System.out.println(a + " Even");
		}
	}
}