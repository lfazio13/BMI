import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		double in = -1.0;
		double lb = -1.0;
		double m = 0.0;
		double kg = 0.0;
		double BMI = 0.0;

		System.out.println("Enter height");

		while (in < 0) {
			if (scan.hasNextDouble()) {
				in = scan.nextDouble();
			} else {
				scan.next();
				System.out.println("Enter a number");
			}
		}
		System.out.println("Enter weight");
		while (lb < 0) {
			if (scan.hasNextDouble()) {
				lb = scan.nextDouble();
			} else {
				scan.next();
				System.out.println("Enter a number");
			}
		}

		m = in / 39.37;
		kg = lb / 2.205;
		BMI = kg / Math.pow(m, 2);
		System.out.println(BMI);
		if (BMI < 19) {
			System.out.println("underweight");
		}
		if (BMI >= 19.0 && BMI <= 24.9) {
			System.out.println("healthy weight");
		}
		if (BMI >= 25.0 && BMI <= 29.9) {
			System.out.println("Overweight");
		}
		if (BMI >= 30.0 && BMI <= 39.9) {
			System.out.println("Obese");
		}
		if (BMI >= 40.0) {
			System.out.println("Exteremely Obese");
		}

	}

}
