package Com.Mentor;

import java.util.Scanner;

public class Assignment_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		 int number = sc.nextInt(); 

	        for (int line = 0; line < number; line++) {                 // * * * *
	            for (int space = 0; space< line; space++) {				//  * * *
	                System.out.print(" ");								//   * *
	            }            											//    *
	            for (int ast = line; ast < number; ast++) {			    //   * *
	                System.out.print("* ");								//  * * *
	            }														// * * * *
	            System.out.println();
	        }

	        for (int line = number - 2; line >= 0; line--) {
	            for (int space = 0; space < line; space++) {
	                System.out.print(" ");
	            }
	            for (int ast= line; ast < number; ast++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	 }

}

