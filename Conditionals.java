class Conditionals {
	public static void main(String[] args) {
		int number = 100;
		if (number < 200 ) {
			System.out.println("Number is less than 200");
		}
		else {
			System.out.println("Number is greater than or equal 200");
		}

		switch (number) {
		case 100:
			System.out.println("Number is equal 100");
			break;
		default:
			System.out.println("Number is other 100");
		}
	}
}
