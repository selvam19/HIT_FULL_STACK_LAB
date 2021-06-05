public class FindLCM {
	public static void main(String[] args) {
		int num_1 = 50, num_2 = 70, lcm;

		// TO FIND MAXIMUM in two number
		lcm = (num_1 > num_2) ? num_1 : num_2;

		while (true) {
			if (num_1 % 2 == 0 && num_2 % 2 == 0) {
				System.out.printf("The LCM of %d and %d is %d", num_2, num_2, lcm);
			}
			++lcm;
		}
	}
}
