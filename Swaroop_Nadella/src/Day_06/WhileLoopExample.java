package Day_06;

public class WhileLoopExample {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;

		}
		int ii = 1;
		while (ii <= 10) {
			System.out.println("Java learn");
			ii++;

		}
		int j = 1;
		while (j <= 10) {
			if (j % 2 == 1)
				System.out.println(j);
			j++;

		}
		int jj = 1;
		while (jj <= 10) {
			if (jj % 2 == 0)
				System.out.println(jj);
			jj++;

		}
		int a = 1;
		while (a <= 10)
			if (a % 2 == 1) {
				System.out.println(a + " ODD");
			} else {
				System.out.println(a + " EVEN");
				a++;
			}
		
	}
}
