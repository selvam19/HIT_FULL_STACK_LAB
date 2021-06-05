public class SwapNumbersWithoutTemp {
	public static void main(String[] args) {
		int number1 = 90, number2 = 80;
		System.out.println("---BEFORE SWAPPING---");
		System.out.println("Value of Number1 = " + number1);
		System.out.println("Value of Number2 = " + number2);

		// swapping without Temp..

		number1 = number1 - number2;
		number2 = number1 + number2;
		number1 = number2 - number1;
		
		System.out.println("---AFTER SWAPPING---");
		System.out.println("Value of Number1 = " + number1);
		System.out.println("Value of Number2 = " + number2);
		
	}
}
