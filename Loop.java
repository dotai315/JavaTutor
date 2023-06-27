import java.io.*;

class Loop {
	public static void main(String[] args) {
		int arr[] = {5, 4, 3, 2, 1};

		for(int i = 0; i < 10; i++) {
			System.out.println("index: " + i);
		}
		
		for(int i : arr) {
			System.out.println("value in arr" + i);
		}

		int i = 0;
		while (i <= 5) {
			System.out.println("i = " + i);
			i++;
		}
	}
}
