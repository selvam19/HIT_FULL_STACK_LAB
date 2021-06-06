import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		int temp;
		boolean is_prime = true;

		// scanning from user..
		Scanner scan = new Scanner(System.in);
		System.out.print("Pls Enter the NUMBER to find PRIME NUMBER : ");

		int num = scan.nextInt();
		scan.close();
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				is_prime = false;
				break;

			}
		}
		if (is_prime) {
			System.out.println("\t" + num + " is a prime number..");
		} else {
			System.out.println("\t" + num + " is not a prime number..");

		}

	}
}
