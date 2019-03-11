import java.util.Scanner;

public class Simple_Compund_Interest {
	public static void main(String[] args) {
		int principale = 0;
		int rate = 0;
		int time = 0;
		double result1 = 0;

		Scanner object = new Scanner(System.in);

		System.out.print("Enter principale amount:");
		principale = object.nextInt();

		System.out.print("Enter rate of interest:");
		rate = object.nextInt();

		System.out.print("Enter time duration:");
		time = object.nextInt();

		float result = (principale * rate * time) / 100;

		System.out.println("Simple Interest is:" + result);

		result1 = principale * Math.pow(1 + rate / 100, time) - principale;

		System.out.println("Compund Interest is:" + result1);

	}
}
