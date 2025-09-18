package Com.Mentor;

import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num =sc.nextInt();
		for (int line = 1; line <=num; line++) {					//a
			char ch ='a';											//a b
			for (int i = 1; i <=line; i++) {						//a b c
				System.out.print(ch+" ");							//a b c d
				ch++;
			}
			System.out.println();
		}
	}

}
