package Com.Mentor;

import java.util.Scanner;

public class Assignment_3 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Character : ");
			int num =sc.nextInt();
			char ch = 'a';
			for (int line = 1; line <=num; line++) {					//a
				//char ch ='a';											//a b
				for (int i =1; i<=line; i++) {						    //a b c
					System.out.print(ch+" ");							//a b c d
					ch++;
				}
				System.out.println();
			}
	}
}
