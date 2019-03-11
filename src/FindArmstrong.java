
public class FindArmstrong {
	public static void main(String[] args) {
		for (int number = 100; number <= 999; number++) {
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
				System.out.println(number);
			}
		}
	}
}
