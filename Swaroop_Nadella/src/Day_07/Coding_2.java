package Day_07;

public class Coding_2 {
	public static void main(String[] args) {

		int num = 12345;
		int remainder = 0;
		int reverse = 0;
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;

		}
		System.out.println(reverse);

	}
}