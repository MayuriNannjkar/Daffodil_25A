package Com.Mentor;

import java.util.Scanner;

public class Assignment_5{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :"); 						//     *
	int num = sc.nextInt();										//    * *
	for (int line = 1; line <=num; line++) {					//	 * * *
		for (int space = num; space >line; space--) {           //  * * * *
			System.out.print(" ");
			
		}
		for (int ast = 1; ast <=line; ast++) {
			System.out.print("*"+" ");
			
		}
		System.out.println();
	}
	}
}
