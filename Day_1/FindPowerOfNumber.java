public class FindPowerOfNumber {
	public static void main(String[] args) {
		long base = 5, exponent = 8, result = 1;
		
		while (exponent != 0) {
			result *= base;  //result = result * base;
			--exponent; //pre-decrease
		}
		System.out.println("Result = " + result);
	}
}
