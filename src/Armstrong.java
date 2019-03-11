import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int number = 0;
		System.out.print("Enter number:");
		Scanner object = new Scanner(System.in);
		number = object.nextInt();
		boolean result;
		result = Check_Armstrong(number);

		if (result == true) {
			System.out.println("Number is Armstrong number");
		} else {
			System.out.println("Number is Not Armstrong number");
		}
	}

	public static boolean Check_Armstrong(int number) {
		int number2 = number;
		int countDigit = 0;
		int digit = 0;
		int result = 1;
		int summation = 0;

		while (number2 != 0) {
			number2 = number2 / 10;
			countDigit++;
		}

		number2 = number;

		while (number2 != 0) {
			digit = number2 % 10;
			number2 = number2 / 10;

			for (int i = 1; i <= countDigit; i++) {
				result = result * digit;
			}
			summation = summation + result;
			result = 1;
		}

		if (summation == number) {
			return true;
		} else {
			return false;
		}
	}

}
