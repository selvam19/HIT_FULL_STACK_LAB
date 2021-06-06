public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int number = 370, original_number, remainder, result = 0;
		
		original_number = number;
		//condition for ARMSTRONG number
		while (original_number != 0) {
			remainder = original_number % 10;
			result += Math.pow(remainder, 3);
			original_number /= 10;
		}
		
		if (result == number) {
			System.out.println(number + " is an armstrong number..");
		} else {
			System.out.println(number + " is an not armstrong number..");
		}
	}
}
