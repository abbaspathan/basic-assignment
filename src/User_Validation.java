import java.util.Scanner;

public class User_Validation {
	public static void main(String[] args) {

		String username = "abbas";
		String password = "xyz@1";
		int attempt = 1;
		String username1;
		String password1;
		boolean flag = true;

		Scanner object = new Scanner(System.in);

		while (flag) {
			System.out.println("Enter your username:");
			username1 = object.nextLine();
			System.out.println("Enter your password:");
			password1 = object.nextLine();

			if ((username.equals(username1)) && (password.equals(password1))) {
				System.out.println("Welcome:" + username);
				flag = false;
			} else {
				if (attempt < 3) {
					System.out.println("Enter correct username and password!!");
					attempt++;
				} else {
					System.out.println("Contact to Admin");
					break;
				}
			}
		}
	}
}
