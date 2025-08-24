package Day_05;

public class NestedIfElseExample2 {

	public static void main(String[] args) {
		int age = 2;
		boolean hasLicense = true;

		if (age >= 18) {
			if (hasLicense) {
				System.out.println("Eligible to drive vehicle");
			} else {
				System.out.println("Not Eligible as no Lincense");
			}
		} else {
			System.out.println("You are eligible to drive due to age criteria");
		}

	}

}
