import java.util.Scanner;

public class Income_Tax {
	public static void main(String[] args) {
		int total_Amount = 0;

		Scanner object = new Scanner(System.in);

		System.out.print("Enter total cost to company:");
		total_Amount = object.nextInt();

		if (total_Amount > 0 && total_Amount <= 180000) {
			System.out.println("Total tax amount:" + 0);
		} else if (total_Amount >= 181001 && total_Amount <= 300000) {
			System.out.println("Total tax amount:" + (.10 * total_Amount));
		} else if (total_Amount >= 300001 && total_Amount <= 500000) {
			System.out.println("Total tax amount:" + (.20 * total_Amount));
		} else if (total_Amount >= 500001 && total_Amount <= 500000) {
			System.out.println("Total tax amount:" + (.30 * total_Amount));
		} else {
			System.out.println("Total tax amount:" + (.40 * total_Amount));
		}
	}
}
