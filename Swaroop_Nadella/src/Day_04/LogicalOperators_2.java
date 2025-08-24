package Day_04;

public class LogicalOperators_2 {

	public static void main(String[] args) {

		boolean b1 = 10 > 20;
		boolean b2 = 20 > 10;
		boolean result = b1 && b2;
		System.out.println(result);
		System.out.println("********");

		boolean logicalor = b1 || b2;
		System.out.println(logicalor);
		System.out.println("********");

		boolean logicahot = !b1;
		System.out.println(logicahot);
	}

}
