import java.util.Scanner;

public class Student_Result {
	public static void main(String[] args) {
		int count = 0;

		int array[] = new int[3];
		Scanner object = new Scanner(System.in);
		for (int j = 0; j < array.length; j++) {
			System.out.print("Enter subject" + (j + 1) + " marks:");
			array[j] = object.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 60) {
				count++;
			}
		}

		if (count == 3) {
			System.out.println("Result:Student is passed");
		} else if (count == 2) {
			System.out.println("Result:Student is promoted");
		} else {
			System.out.println("Result:Student is faield");
		}
	}
}
