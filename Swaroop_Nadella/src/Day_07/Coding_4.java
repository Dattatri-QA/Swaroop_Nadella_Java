package Day_07;

public class Coding_4 {
	public static void main(String[] args) {

		int num = 123123;
		int remainder = 0;
		int count = 0;
		while (num > 0) {
			remainder = num % 10;
			count++;
			num = num / 10;

		}
		System.out.println(count);

	}
}
