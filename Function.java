import java.io.*;

class Function {
	public static int Sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int number1 = 300;
		int number2 = 400;

		System.out.println("Sum of " + number1 + " and " + number2 + " = " + Sum(number1, number2)); 
	}
}
