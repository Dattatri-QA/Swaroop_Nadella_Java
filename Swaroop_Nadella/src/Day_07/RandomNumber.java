package Day_07;

public class RandomNumber {

	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);

		double dd = Math.random();
		System.out.println(dd);

		double twoDigit = Math.random() * 100;
		System.out.println(twoDigit);

		int num = (int) Math.random();
		System.out.println(num);
	}

}
