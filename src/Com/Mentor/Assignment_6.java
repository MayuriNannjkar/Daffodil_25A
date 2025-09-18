package Com.Mentor;

import java.util.Scanner;

public class Assignment_6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int number = sc.nextInt();
	for (int line = 1; line <=number; line++) {
		for (int space = number; space >line; space--) {
			System.out.print(" ");
			
		}
		for (int num = 1; num <=line; num++) {
			System.out.print(num+" ");
			
		}
		System.out.println();
	}
}
}
