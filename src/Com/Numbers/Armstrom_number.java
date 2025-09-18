package Com.Numbers;

import java.util.Scanner;

public class Armstrom_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int user = sc.nextInt();
		int length =0;
		int  digit = user;
		while(digit !=0) {
			digit =  digit /10;
			length++;
		}
		System.out.println("Number of length "+length);
		int a = user;
		int b;
		int store;
		int result1 = 0;
		for (int i = 1; i <= length; i++) {

			b = a % 10;

			store = b;
			for (int j =1;j<length; j++) {

				store = store * b;

			}
			a = a / 10;
			result1 = result1 + store;

		}

		a = user;
		if (a == result1)
			System.out.println(a + " is a armstrom number");
		else
			System.out.println(a + " is not a armstrom number");
	}

}
	

